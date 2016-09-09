package ar.com.mailchimp.method.v3_0.campaign;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.PathParam;

@Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/campaigns/{campaign_id}/actions/send")
public class SendCampaignMethod extends MailchimpMethod<SendCampaignResponse> {

	@PathParam
	private String campaign_id;

	
	public String getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(String campaign_id) {
		this.campaign_id = campaign_id;
	}
	
	
}
