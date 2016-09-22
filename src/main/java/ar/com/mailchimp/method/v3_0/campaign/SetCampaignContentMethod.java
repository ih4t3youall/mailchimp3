package ar.com.mailchimp.method.v3_0.campaign;

import java.util.List;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.Field;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.PathParam;

@Method(httpMethod = HttpMethod.PUT, version = APIVersion.v3_0, path = "/campaigns/{campaign_id}/content")
public class SetCampaignContentMethod extends MailchimpMethod<SetCampaignContentResponse> {
	
	@PathParam
	private String campaign_id;
	
	@Field
	private String plain_text;
	
	@Field
	private String html;
	
	@Field
	private String url;
	
	@Field
	private MailchimpObject template;
	
	@Field
	private MailchimpObject archive;
	
	@Field
	private List<MailchimpObject> variate_contents;

	
	public String getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(String campaign_id) {
		this.campaign_id = campaign_id;
	}

	public String getPlain_text() {
		return plain_text;
	}

	public void setPlain_text(String plain_text) {
		this.plain_text = plain_text;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public MailchimpObject getTemplate() {
		return template;
	}

	public void setTemplate(MailchimpObject template) {
		this.template = template;
	}

	public MailchimpObject getArchive() {
		return archive;
	}

	public void setArchive(MailchimpObject archive) {
		this.archive = archive;
	}

	public List<MailchimpObject> getVariate_contents() {
		return variate_contents;
	}

	public void setVariate_contents(List<MailchimpObject> variate_contents) {
		this.variate_contents = variate_contents;
	}
	
	
}
