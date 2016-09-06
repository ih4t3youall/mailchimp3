package ar.com.martin;

import java.io.IOException;

import com.ecwid.maleorang.MailchimpClient;
import com.ecwid.maleorang.MailchimpException;
import com.ecwid.maleorang.method.v3_0.members.GetMemberMethod;
import com.ecwid.maleorang.method.v3_0.members.MemberInfo;

public class Main {

	private static String apiKey = "219cbcc12d2141796822bc6e6a9deb97-us14";
	private static MailchimpClient client = new MailchimpClient(apiKey);
	
	public static void main(String[] args) throws IOException, MailchimpException {
		
		getMember();
	}

	
	public static void getMember() throws IOException, MailchimpException{
		GetMemberMethod gtm = new GetMemberMethod("c49405bac5", "m3lton.c@gmail.com");
		MemberInfo mi = client.execute(gtm);
		System.out.println(mi);
	}
	
} 
