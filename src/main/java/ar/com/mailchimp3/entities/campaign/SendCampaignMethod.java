package ar.com.mailchimp3.entities.campaign;

import org.jetbrains.annotations.NotNull;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.PathParam;

@Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/campaigns/{campaign_id}/actions/send")
public class SendCampaignMethod extends MailchimpMethod<SendCampaignResponse> {

	@PathParam
	@NotNull
	public  String campaign_id;
	
	
}
