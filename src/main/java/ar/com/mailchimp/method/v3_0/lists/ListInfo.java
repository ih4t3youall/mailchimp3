package ar.com.mailchimp.method.v3_0.lists;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class ListInfo extends MailchimpObject {

	@Field
	private String id;
	
	@Field
	private String name;
	
	@Field
	private MailchimpObject contact;
	
	@Field
	private String permission_reminder;
	
	@Field
	private Boolean use_archive_bar;
	
	@Field
	private MailchimpObject campaign_defaults;
	
	@Field
	private String notify_on_subscribe;
	
	@Field
	private String notify_on_unsubscribe;
	
	@Field
	private String date_created;
	
	@Field
	private Integer list_rating;
	
	@Field
	private Boolean email_type_option;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MailchimpObject getContact() {
		return contact;
	}

	public void setContact(MailchimpObject contact) {
		this.contact = contact;
	}

	public String getPermission_reminder() {
		return permission_reminder;
	}

	public void setPermission_reminder(String permission_reminder) {
		this.permission_reminder = permission_reminder;
	}

	public Boolean getUse_archive_bar() {
		return use_archive_bar;
	}

	public void setUse_archive_bar(Boolean use_archive_bar) {
		this.use_archive_bar = use_archive_bar;
	}

	public MailchimpObject getCampaign_defaults() {
		return campaign_defaults;
	}

	public void setCampaign_defaults(MailchimpObject campaign_defaults) {
		this.campaign_defaults = campaign_defaults;
	}

	public String getNotify_on_subscribe() {
		return notify_on_subscribe;
	}

	public void setNotify_on_subscribe(String notify_on_subscribe) {
		this.notify_on_subscribe = notify_on_subscribe;
	}

	public String getNotify_on_unsubscribe() {
		return notify_on_unsubscribe;
	}

	public void setNotify_on_unsubscribe(String notify_on_unsubscribe) {
		this.notify_on_unsubscribe = notify_on_unsubscribe;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public Integer getList_rating() {
		return list_rating;
	}

	public void setList_rating(Integer list_rating) {
		this.list_rating = list_rating;
	}

	public Boolean getEmail_type_option() {
		return email_type_option;
	}

	public void setEmail_type_option(Boolean email_type_option) {
		this.email_type_option = email_type_option;
	}
	
}
