package ar.com.martin;

import java.io.IOException;
import java.util.List;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.MailchimpObject;

import ar.com.mailchimp3.GetTemplatesMethod;
import ar.com.mailchimp3.entities.campaign.CreateCampaignMethod;
import ar.com.mailchimp3.entities.campaign.CreateCampaignResponse;
import ar.com.mailchimp3.entities.campaign.SendCampaignMethod;
import ar.com.mailchimp3.entities.campaign.SetCampaignContentMethod;
import ar.com.mailchimp3.entities.campaign.SetCampaignContentResponse;
import ar.com.mailchimp3.entities.templates.TemplateInfo;
import ar.com.mailchimp3.entities.templates.TemplateResponse;

public class Main {

	private static String apiKey = "fc18d11525f50bd8726d01e0a7d2244e-us14";
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		
//		getTemplates();
		String campaign_id = createCampaign();
//		new VistaInicio();
		setCampaignContent(campaign_id);
		sendCampaigns(campaign_id);
	}

	
	public static String createCampaign() throws IOException, MailchimpException{
//		GetMemberMethod gtm = new GetMemberMethod("c49405bac5", "m3lton.c@gmail.com");
		CreateCampaignMethod createCampaign = new CreateCampaignMethod();
		createCampaign.setType("regular");
		
		MailchimpObject settings = new MailchimpObject();
		settings.mapping.put("subject_line", "hola1");
		settings.mapping.put("from_name", "watamasai");
		settings.mapping.put("reply_to", "watamasai@hotmail.com");
		
		MailchimpObject recipients = new MailchimpObject();
		recipients.mapping.put("list_id", "c49405bac5");
		
		
		createCampaign.mapping.put("recipients", recipients);
		createCampaign.mapping.put("settings",settings );
		
		CreateCampaignResponse execute = client.execute(createCampaign);
		return  execute.getId();
		
		
	}
	
	
	public static List<TemplateInfo> getTemplates() throws IOException, MailchimpException{
//		GetMemberMethod gtm = new GetMemberMethod("c49405bac5", "m3lton.c@gmail.com");
		GetTemplatesMethod nose = new GetTemplatesMethod();
		TemplateResponse execute = client.execute(nose);
		List<TemplateInfo> templates = execute.getTemplates();
		return templates;
	}
	
	public static void sendCampaigns(String campaign_id) throws IOException, MailchimpException{
		SendCampaignMethod sendMethod= new SendCampaignMethod();
		sendMethod.campaign_id=campaign_id;
		client.execute(sendMethod);
		
		
	}
	
	public static void setCampaignContent(String campaign_id) throws IOException, MailchimpException{
		SetCampaignContentMethod setCampaignContentMethod = new SetCampaignContentMethod();
		
		MailchimpObject template = new MailchimpObject();
		template.mapping.put("id", 5039);
		
		MailchimpObject sections = new MailchimpObject();
		sections.mapping.put("draw", "MARTIN");
		sections.mapping.put("game", "El MEJOR");
		sections.mapping.put("result", "LUCIAN/RENGAR DE TU VIDA!!!!!!!");
		template.mapping.put("sections", sections);
		
		setCampaignContentMethod.mapping.put("template", template);
		setCampaignContentMethod.campaign_id = campaign_id;
		
		client.execute(setCampaignContentMethod);
		System.out.println("*********************");
		System.out.println(campaign_id);
		System.out.println("*********************");
		
	}
	
} 
