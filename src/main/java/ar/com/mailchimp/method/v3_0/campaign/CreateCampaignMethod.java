package ar.com.mailchimp.method.v3_0.campaign;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.Field;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;

@Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/campaigns")
public class CreateCampaignMethod extends MailchimpMethod<CreateCampaignResponse> {

	@Field
	private String type;
	
	@Field
	private MailchimpObject recipients;
	
	@Field
	private MailchimpObject settings;
	
	@Field
	private MailchimpObject variate_settings;
	
	@Field
	private MailchimpObject tracking;
	
	@Field
	private MailchimpObject rss_opts;
	
	@Field
	private MailchimpObject social_card;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MailchimpObject getRecipients() {
		return recipients;
	}

	public void setRecipients(MailchimpObject recipients) {
		this.recipients = recipients;
	}

	public MailchimpObject getSettings() {
		return settings;
	}

	public void setSettings(MailchimpObject settings) {
		this.settings = settings;
	}

	public MailchimpObject getVariate_settings() {
		return variate_settings;
	}

	public void setVariate_settings(MailchimpObject variate_settings) {
		this.variate_settings = variate_settings;
	}

	public MailchimpObject getTracking() {
		return tracking;
	}

	public void setTracking(MailchimpObject tracking) {
		this.tracking = tracking;
	}

	public MailchimpObject getRss_opts() {
		return rss_opts;
	}

	public void setRss_opts(MailchimpObject rss_opts) {
		this.rss_opts = rss_opts;
	}

	public MailchimpObject getSocial_card() {
		return social_card;
	}

	public void setSocial_card(MailchimpObject social_card) {
		this.social_card = social_card;
	}

}
