package ar.com.martin;

import java.io.IOException;
import java.util.List;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;

import ar.com.mailchimp3.entities.GetTemplates;
import ar.com.mailchimp3.entities.TemplateInfo;
import ar.com.mailchimp3.entities.TemplateResponse;

public class Main {

	private static String apiKey = "4c0f673f317a69be6489afb8d6ed13aa-us14";
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		getMember();
	}

	
	public static void getMember() throws IOException, MailchimpException{
//		GetMemberMethod gtm = new GetMemberMethod("c49405bac5", "m3lton.c@gmail.com");
		GetTemplates nose = new GetTemplates();
		TemplateResponse execute = client.execute(nose);
		List<TemplateInfo> templates = execute.getTemplates();
		System.out.println(execute.toString());
	}
	
} 
