package ar.com.app;

import java.io.IOException;
import java.util.List;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.MailchimpObject;

import ar.com.mailchimp.method.v3_0.campaign.CreateCampaignMethod;
import ar.com.mailchimp.method.v3_0.campaign.CreateCampaignResponse;
import ar.com.mailchimp.method.v3_0.campaign.SendCampaignMethod;
import ar.com.mailchimp.method.v3_0.campaign.SetCampaignContentMethod;
import ar.com.mailchimp.method.v3_0.members.AddMemberMethod;
import ar.com.mailchimp.method.v3_0.templates.GetTemplatesMethod;
import ar.com.mailchimp.method.v3_0.templates.GetTemplatesResponse;
import ar.com.mailchimp.method.v3_0.templates.TemplateInfo;

public class TestMain {

	private static String apiKey = "INSERT APIKEY HERE";
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		String campaign_id;

		addSubscriber();
		
		campaign_id = createCampaign();
		setCampaignContent(campaign_id);
		sendCampaign(campaign_id);
		
	}

	
	public static String createCampaign() throws IOException, MailchimpException{
		
		CreateCampaignMethod createCampaign = new CreateCampaignMethod();
		createCampaign.setType("regular");
		
		MailchimpObject settings = new MailchimpObject();
		settings.mapping.put("subject_line", "Test");
		settings.mapping.put("from_name", "Testomator");
		settings.mapping.put("reply_to", "INSERT VALID E-MAIL ADRESS HERE");
		settings.mapping.put("title", "Test Campaign");
		
		MailchimpObject recipients = new MailchimpObject();
		recipients.mapping.put("list_id", "INSERT LIST ID HERE" );
		
		createCampaign.mapping.put("recipients", recipients);
		createCampaign.mapping.put("settings",settings);
		
		CreateCampaignResponse createCampaignResponse = client.execute(createCampaign);
		return  createCampaignResponse.getId();
		
	}
	
	
	public static void setCampaignContent(String campaignId) throws IOException, MailchimpException{
			
		SetCampaignContentMethod setCampaignContentMethod = new SetCampaignContentMethod();
		
		MailchimpObject template = new MailchimpObject();
		template.mapping.put("id", getTemplateIdByName("name_of_the_template"));
		
		MailchimpObject sections = new MailchimpObject();
		sections.mapping.put("name", "Tester");
		sections.mapping.put("lastname", "Testerin");
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
	
	
	public static void addSubscriber() throws IOException, MailchimpException{
		
		AddMemberMethod addMemberMethod = new AddMemberMethod();
		
		addMemberMethod.setList_id("INSERT LIST ID HERE");
		addMemberMethod.setEmail_address("INSERT E-MAIL TO SUBSCRIBE HERE");
		addMemberMethod.setStatus("subscribed");
		MailchimpObject merge_fields = new MailchimpObject();
		merge_fields.mapping.put("USERNAME", "tester1991");
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
