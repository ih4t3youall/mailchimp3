package ar.com.app;

import java.io.IOException;
import java.util.List;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.MailchimpObject;

import ar.com.bit8.entities.Bit8Response;
import ar.com.mailchimp.method.v3_0.campaign.CreateCampaignMethod;
import ar.com.mailchimp.method.v3_0.campaign.CreateCampaignResponse;
import ar.com.mailchimp.method.v3_0.campaign.SendCampaignMethod;
import ar.com.mailchimp.method.v3_0.campaign.SetCampaignContentMethod;
import ar.com.mailchimp.method.v3_0.members.AddMemberMethod;
import ar.com.mailchimp.method.v3_0.templates.GetTemplatesMethod;
import ar.com.mailchimp.method.v3_0.templates.GetTemplatesResponse;
import ar.com.mailchimp.method.v3_0.templates.TemplateInfo;

public class Main2 {

	private static String apiKey = "a033d8703eef512f167d62b62fd93274-us14";
	
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		String campaign_id;

//		addSubscriptor();
		

		campaign_id = createCampaign();
		setCampaignContent(campaign_id);
		sendCampaign(campaign_id);
		
		
	}

	
	public static String createCampaign() throws IOException, MailchimpException{
		CreateCampaignMethod createCampaign = new CreateCampaignMethod();
		createCampaign.setType("regular");
		
		MailchimpObject settings = new MailchimpObject();
		settings.mapping.put("subject_line", "Lotto Lottery Results");
		settings.mapping.put("from_name", "LottoMaster");
		settings.mapping.put("reply_to", "sombra571@hotmail.com");
		settings.mapping.put("title", "Lotto Campaign");
		
		MailchimpObject recipients = new MailchimpObject();
		recipients.mapping.put("list_id", "c49405bac5" );
		
		createCampaign.mapping.put("recipients", recipients);
		createCampaign.mapping.put("settings",settings);
		
		CreateCampaignResponse createCampaignResponse = client.execute(createCampaign);
		return  createCampaignResponse.getId();
	}
	
	
	public static void setCampaignContent(String campaignId) throws IOException, MailchimpException{
			
			SetCampaignContentMethod setCampaignContentMethod = new SetCampaignContentMethod();
			
			MailchimpObject template = new MailchimpObject();
			template.mapping.put("id", getTemplateIdByName("Template"));
			
			MailchimpObject sections = new MailchimpObject();
			sections.mapping.put("draw", "#1489");
			sections.mapping.put("game", "Lotto Lottery ");
			sections.mapping.put("result", "04-11-14-20-27-32");
			template.mapping.put("sections", sections);
			
			setCampaignContentMethod.setTemplate(template);
			setCampaignContentMethod.setCampaign_id(campaignId);
			
			client.execute(setCampaignContentMethod);
	
	}
	
	
	public static void sendCampaign(String campaignId) throws IOException, MailchimpException{
		
		SendCampaignMethod sendMethod= new SendCampaignMethod();
		sendMethod.setCampaign_id(campaignId);
		client.execute(sendMethod);
			
	}
	
	
	public static void addSubscriptor() throws IOException, MailchimpException{
		AddMemberMethod addMemberMethod = new AddMemberMethod();
		
		addMemberMethod.setList_id("c49405bac5");
		addMemberMethod.setEmail_address("m3lton.c@gmail.com");
		addMemberMethod.setStatus("subscribed");
		MailchimpObject merge_fields = new MailchimpObject();
		merge_fields.mapping.put("DATAUSER", "Solange");
		addMemberMethod.setMerge_fields(merge_fields);
		System.out.println(addMemberMethod.toJson());
		System.out.println(client.execute(addMemberMethod));
	}

	
	public static Integer getTemplateIdByName(String templateName) throws IOException, MailchimpException{

		GetTemplatesMethod getTemplateMethod = new GetTemplatesMethod();
		GetTemplatesResponse execute = client.execute(getTemplateMethod);
		List<TemplateInfo> templates = execute.getTemplates();
		
		for (TemplateInfo templateInfo : templates) {
			if(templateInfo.getName().equals(templateName))
				return templateInfo.getId(); 
		}
		
		return null;
	}
	
}
