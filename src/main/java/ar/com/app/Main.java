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
import ar.com.mailchimp.method.v3_0.lists.GetListsMethod;
import ar.com.mailchimp.method.v3_0.lists.GetListsResponse;
import ar.com.mailchimp.method.v3_0.lists.ListInfo;
import ar.com.mailchimp.method.v3_0.templates.GetTemplatesMethod;
import ar.com.mailchimp.method.v3_0.templates.GetTemplatesResponse;
import ar.com.mailchimp.method.v3_0.templates.TemplateInfo;

public class Main {

	private static String apiKey = "API-KEY HERE";
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		String campaign_id;
		String game_id = "123";
		String templateName = "";
		String listName = "";
		
		
		campaign_id = createCampaign(game_id);
		
		Bit8Response bit8Response = getBit8Result(game_id);
		setCampaignContent(bit8Response, templateName, listName, campaign_id);
		sendCampaign(campaign_id);
		
		//sendCampaigns(bit8);
	}

	public static Bit8Response getBit8Result(String game_id){		
		
		Bit8Response bit8Response = new Bit8Response();
		
		//Call to Bit8 to retrieve the results of the lottery game
		String draw_number = "#1489";
		String game_name = "Lotto Lottery";
		String result_numbers = "04-11-14-20-27-32";
		//End of the Bit8 call
		
		bit8Response.setDraw_number(draw_number);
		bit8Response.setGame_name(game_name);
		bit8Response.setResult_numbers(result_numbers);
		
		return bit8Response;
		
	}
	
	public static String createCampaign(String game_id) throws IOException, MailchimpException{

		CreateCampaignMethod createCampaign = new CreateCampaignMethod();
		createCampaign.setType("regular");
		
		MailchimpObject settings = new MailchimpObject();
		settings.mapping.put("subject_line", "Lotto Lottery Results");
		settings.mapping.put("from_name", "LottoMaster");
		settings.mapping.put("reply_to", "somemail@example.com");
		settings.mapping.put("title", "Campaign game: " + game_id);
		
		MailchimpObject recipients = new MailchimpObject();
		recipients.mapping.put("list_id", getListIdByName("List+"+game_id) );
		
		createCampaign.mapping.put("recipients", recipients);
		createCampaign.mapping.put("settings",settings);
		
		CreateCampaignResponse createCampaignResponse = client.execute(createCampaign);
		return  createCampaignResponse.getId();
		
	}
	
	
	public static void setCampaignContent(Bit8Response bit8Response, String templateName, String listName, String campaignId) throws IOException, MailchimpException{
		
		SetCampaignContentMethod setCampaignContentMethod = new SetCampaignContentMethod();
		
		MailchimpObject template = new MailchimpObject();
		template.mapping.put("id", getTemplateIdByName(templateName));
		
		MailchimpObject sections = new MailchimpObject();
		sections.mapping.put("draw", "#1489");
		sections.mapping.put("game", "Lotto Lottery ");
		sections.mapping.put("result", "04-11-14-20-27-32");
		template.mapping.put("sections", sections);
		
		setCampaignContentMethod.setTemplate(template);
		setCampaignContentMethod.setCampaign_id(campaignId);
		
		client.execute(setCampaignContentMethod);
		System.out.println("*********************");
		System.out.println(campaignId);
		System.out.println("*********************");
		
	}
	
	
	public static void sendCampaign(String campaignId) throws IOException, MailchimpException{
			
		SendCampaignMethod sendMethod= new SendCampaignMethod();
		sendMethod.setCampaign_id(campaignId);
		client.execute(sendMethod);
			
	}


	public static String getListIdByName(String list_name) throws IOException, MailchimpException{
		
		GetListsMethod getLists = new GetListsMethod();
		GetListsResponse execute = client.execute(getLists);
		List<ListInfo> lists = execute.getLists();
		
		for (ListInfo listInfo : lists) {
			if(listInfo.getName().equals(list_name))
				return listInfo.getId();
		}
		
		return null;
		
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