package ar.com.mailchimp.conection;

import com.ecwid.maleorang.MailchimpClient;

public class ClientBuilder {
	
	
	private static String apiKey = "INSERT APIKEY HERE";
	
	private final MailchimpClient client;
	
	public ClientBuilder(){
		
		client = new MailchimpClient(apiKey);
		
		
	}
	
	public MailchimpClient getClient(){
		
		return client;
		
	}
	
	

}
