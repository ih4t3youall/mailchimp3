package ar.com.mailchimp3.entities;

import java.util.List;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class TemplateResponse extends MailchimpObject {
	
	@Field
	private List<TemplateInfo> templates;
	@Field
	private Integer total_items;
	@Field
	private List<Link> _links;


	public List<TemplateInfo> getTemplates() {
		return templates;
	}

	public void setTemplates(List<TemplateInfo> templates) {
		this.templates = templates;
	}

	public Integer getTotal_items() {
		return total_items;
	}

	public void setTotal_items(Integer total_items) {
		this.total_items = total_items;
	}

	public List<Link> get_links() {
		return _links;
	}

	public void set_links(List<Link> _links) {
		this._links = _links;
	}




}
