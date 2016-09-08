package ar.com.mailchimp3.entities;

import java.util.Map;

import com.ecwid.maleorang.MailchimpObject;

public class Bit8Object {

	private String template_name;
	private Integer template_id;
	private String list_id;
	private String campaign_id;
	private String list_name;
	private MailchimpObject editable_content;
	private MailchimpObject settings;

	
	
	
	public Integer getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(Integer template_id) {
		this.template_id = template_id;
	}

	public String getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(String campaign_id) {
		this.campaign_id = campaign_id;
	}

	public String getList_id() {
		return list_id;
	}

	public void setList_id(String list_id) {
		this.list_id = list_id;
	}

	public MailchimpObject getSettings() {
		return settings;
	}

	public void setSettings(MailchimpObject settings) {
		this.settings = settings;
	}

	public String getTemplate_name() {
		return template_name;
	}

	public void setTemplate_name(String template_name) {
		this.template_name = template_name;
	}

	public String getList_name() {
		return list_name;
	}

	public void setList_name(String list_name) {
		this.list_name = list_name;
	}

	public MailchimpObject getEditable_content() {
		return editable_content;
	}

	public void setEditable_content(MailchimpObject editable_content) {
		this.editable_content = editable_content;
	}



}
