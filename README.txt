Here are some samples of how to use this wrapper:

To create a campaign you need to create a new instance of the Class CreateCampaignMethod, and do something like this:

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
		
		
Remember to set the api key you get from mailchimp. You will use that api key to create the connection. In the class ClientBuilder you can put your mailchimp API-Key. 
Also if you use Spring or something like it, you can use that class and inject it where you need.

The Members list and campaing methods work in a similar way.
If you need to extends the funcionality  you can refer to this page: http://developer.mailchimp.com/documentation/mailchimp/reference/overview/ here you can find the MailChimp API.


This wrapper was extended by Milton Carballo and Martin Lequerica from Accenture and based in this implementation: https://github.com/Ecwid/maleorang.git 
