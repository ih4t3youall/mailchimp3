package ar.com.mailchimp3.entities.campaign;

import java.util.List;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

import ar.com.mailchimp3.entities.templates.Link;

public class CreateCampaignResponse extends MailchimpObject {

	@Field
	private String id;
	@Field
	private String type;
	@Field
	private String create_time;
	@Field
	private String long_archive_url;
	@Field
	private String status;
	@Field
	private Integer emails_send;
	@Field
	private String send_time;
	@Field
	private String content_type;
	@Field
	private MailchimpObject settings;
	@Field
	private MailchimpObject variate_settings;
	@Field
	private MailchimpObject tracking;
	@Field
	private MailchimpObject rss_opts;
	@Field
	private MailchimpObject ab_split_opts;
	@Field
	private MailchimpObject social_cards;
	@Field
	private MailchimpObject report_summary;
	@Field
	private MailchimpObject delivery_status;
	@Field
	private List<Link> _links;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getLong_archive_url() {
		return long_archive_url;
	}

	public void setLong_archive_url(String long_archive_url) {
		this.long_archive_url = long_archive_url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getEmails_send() {
		return emails_send;
	}

	public void setEmails_send(Integer emails_send) {
		this.emails_send = emails_send;
	}

	public String getSend_time() {
		return send_time;
	}

	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
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

	public MailchimpObject getAb_split_opts() {
		return ab_split_opts;
	}

	public void setAb_split_opts(MailchimpObject ab_split_opts) {
		this.ab_split_opts = ab_split_opts;
	}

	public MailchimpObject getSocial_cards() {
		return social_cards;
	}

	public void setSocial_cards(MailchimpObject social_cards) {
		this.social_cards = social_cards;
	}

	public MailchimpObject getReport_summary() {
		return report_summary;
	}

	public void setReport_summary(MailchimpObject report_summary) {
		this.report_summary = report_summary;
	}

	public MailchimpObject getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(MailchimpObject delivery_status) {
		this.delivery_status = delivery_status;
	}

	public List<Link> get_links() {
		return _links;
	}

	public void set_links(List<Link> _links) {
		this._links = _links;
	}

}
