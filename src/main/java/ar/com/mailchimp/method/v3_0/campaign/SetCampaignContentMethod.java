package ar.com.mailchimp.method.v3_0.campaign;

import org.jetbrains.annotations.NotNull;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.PathParam;

@Method(httpMethod = HttpMethod.PUT, version = APIVersion.v3_0, path = "/campaigns/{campaign_id}/content")
public class SetCampaignContentMethod extends MailchimpMethod<SetCampaignContentResponse> {
	
	@PathParam
	@NotNull
	public  String campaign_id;
	
	
	

}
