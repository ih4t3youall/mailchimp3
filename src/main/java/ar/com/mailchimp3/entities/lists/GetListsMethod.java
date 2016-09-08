package ar.com.mailchimp3.entities.lists;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;

@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists")
public class GetListsMethod extends MailchimpMethod<GetListsResponse>{

	
	
}
