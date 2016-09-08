package ar.com.martin;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.MailchimpObject;

import ar.com.mailchimp3.GetTemplatesMethod;
import ar.com.mailchimp3.entities.Bit8Object;
import ar.com.mailchimp3.entities.campaign.CreateCampaignMethod;
import ar.com.mailchimp3.entities.campaign.CreateCampaignResponse;
import ar.com.mailchimp3.entities.campaign.SendCampaignMethod;
import ar.com.mailchimp3.entities.campaign.SetCampaignContentMethod;
import ar.com.mailchimp3.entities.lists.GetListsMethod;
import ar.com.mailchimp3.entities.lists.GetListsResponse;
import ar.com.mailchimp3.entities.templates.TemplateInfo;
import ar.com.mailchimp3.entities.templates.TemplateResponse;

public class Main {

	private static String apiKey = "29e26c3368788fc3242453fff40f6653-us14";
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		String game_id = "123";
		Bit8Object bit8 = getBit8(game_id);
		
		
		
		 String mailchimpListId = getMailchimpListId(bit8.getList_name());
		 bit8.setList_id(mailchimpListId);
		String campaign_id = createCampaign(bit8);
		bit8.setCampaign_id(campaign_id);
		
		Integer template_id = getTemplate(bit8);
		bit8.setTemplate_id(template_id);
		setCampaignContent(bit8);
		sendCampaigns(bit8);
		
		
	}

	public static Bit8Object getBit8(String game_id){
		
		Map<String,String> mapa = new LinkedHashMap<>();
		
		
		MailchimpObject settings = new MailchimpObject();
		settings.mapping.put("subject_line", "subject line");
		settings.mapping.put("from_name", "from_name_watakamasai");
		settings.mapping.put("reply_to", "watamasai@outlook.com");
		
		Bit8Object bit8 = new Bit8Object();
		bit8.setSettings(settings);
		
		bit8.setTemplate_name("Pikachu");
		bit8.setList_name("Listita");
		
		MailchimpObject sections = new MailchimpObject();
		sections.mapping.put("draw", "MARTIN");
		sections.mapping.put("game", "El MEJOR");
		sections.mapping.put("result", "LUCIAN/RENGAR DE TU VIDA!!!!!!!");
		
		bit8.setEditable_content(sections);
		
		return bit8;
		
		
		
		
	}
	
	public static String getMailchimpListId(String list_name) throws IOException, MailchimpException{
		
		GetListsMethod getListas = new GetListsMethod();
		GetListsResponse execute = client.execute(getListas);
		List<MailchimpObject> lists = execute.getLists();
		for (MailchimpObject mailchimpObject : lists) {
			if(mailchimpObject.mapping.get("name").equals(list_name))
				return (String) mailchimpObject.mapping.get("id");
		}
		return null;
		
		
	}
	
	public static String createCampaign(Bit8Object bit8) throws IOException, MailchimpException{
//		GetMemberMethod gtm = new GetMemberMethod("c49405bac5", "m3lton.c@gmail.com");
		CreateCampaignMethod createCampaign = new CreateCampaignMethod();
		createCampaign.setType("regular");
		
//		MailchimpObject settings = new MailchimpObject();
//		settings.mapping.put("subject_line", "hola1");
//		settings.mapping.put("from_name", "watamasai");
//		settings.mapping.put("reply_to", "watamasai@hotmail.com");
		
		MailchimpObject recipients = new MailchimpObject();
		recipients.mapping.put("list_id", bit8.getList_id());
		
		
		createCampaign.mapping.put("recipients", recipients);
		createCampaign.mapping.put("settings",bit8.getSettings());
		
		CreateCampaignResponse execute = client.execute(createCampaign);
		return  execute.getId();
		
		
	}
	
	
	public static Integer getTemplate(Bit8Object bit8) throws IOException, MailchimpException{
//		GetMemberMethod gtm = new GetMemberMethod("c49405bac5", "m3lton.c@gmail.com");
		GetTemplatesMethod getTemplateMethod = new GetTemplatesMethod();
		TemplateResponse execute = client.execute(getTemplateMethod);
		List<TemplateInfo> templates = execute.getTemplates();
		for (TemplateInfo templateInfo : templates) {
			
			if(templateInfo.mapping.get("name").equals(bit8.getTemplate_name()))
				return (Integer) templateInfo.mapping.get("id"); 
			
		}
		
		return null;
	}
	
	public static void sendCampaigns(Bit8Object bit8) throws IOException, MailchimpException{
		SendCampaignMethod sendMethod= new SendCampaignMethod();
		sendMethod.campaign_id=bit8.getCampaign_id();
		client.execute(sendMethod);
		
		
	}
	
	public static void setCampaignContent(Bit8Object bit8) throws IOException, MailchimpException{
		SetCampaignContentMethod setCampaignContentMethod = new SetCampaignContentMethod();
		
		MailchimpObject template = new MailchimpObject();
		template.mapping.put("id", bit8.getTemplate_id());
		
		
		template.mapping.put("sections", bit8.getEditable_content());
		
		setCampaignContentMethod.mapping.put("template", template);
		setCampaignContentMethod.campaign_id = bit8.getCampaign_id();
		
		client.execute(setCampaignContentMethod);
		System.out.println("*********************");
		System.out.println(bit8.getCampaign_id());
		System.out.println("*********************");
		
	}
	
} 
