package ar.com.mailchimp3.entities.campaign;

import java.util.List;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class SetCampaignContentResponse extends MailchimpObject {

	@Field
	private List<MailchimpObject> variate_contents;
	@Field
	private String plain_text;
	@Field
	private String html;
	@Field
	private List<MailchimpObject> _links;

	public List<MailchimpObject> getVariate_contents() {
		return variate_contents;
	}

	public void setVariate_contents(List<MailchimpObject> variate_contents) {
		this.variate_contents = variate_contents;
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

	public List<MailchimpObject> get_links() {
		return _links;
	}

	public void set_links(List<MailchimpObject> _links) {
		this._links = _links;
	}

}
