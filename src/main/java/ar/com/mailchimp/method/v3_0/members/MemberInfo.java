package ar.com.mailchimp.method.v3_0.members;

import java.util.List;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class MemberInfo extends MailchimpObject {

	@Field
	private String id;
	
	@Field
	private String email_address;
	
	@Field
	private String unique_email_id;
	
	@Field
	private String email_type;
	
	@Field
	private String status;
	
	@Field
	private MailchimpObject merge_fields;
	
	@Field
	private MailchimpObject interests;
	
	@Field
	private MailchimpObject stats;
	
	@Field
	private String ip_signup;
	
	@Field
	private String timestamp_signup;
	
	@Field
	private String ip_opt;
	
	@Field
	private String timestamp_opt;
	
	@Field
	private Integer member_rating;
	
	@Field
	private String last_changed;
	
	@Field
	private String language;
	
	@Field
	private Boolean vip;
	
	@Field
	private String email_client;
	
	@Field
	private MailchimpObject location;
	
	@Field
	private MailchimpObject last_note;
	
	@Field
	private String list_id;
	
	@Field
	private List<MailchimpObject> _links;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getUnique_email_id() {
		return unique_email_id;
	}

	public void setUnique_email_id(String unique_email_id) {
		this.unique_email_id = unique_email_id;
	}

	public String getEmail_type() {
		return email_type;
	}

	public void setEmail_type(String email_type) {
		this.email_type = email_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MailchimpObject getMerge_fields() {
		return merge_fields;
	}

	public void setMerge_fields(MailchimpObject merge_fields) {
		this.merge_fields = merge_fields;
	}

	public MailchimpObject getInterests() {
		return interests;
	}

	public void setInterests(MailchimpObject interests) {
		this.interests = interests;
	}

	public MailchimpObject getStats() {
		return stats;
	}

	public void setStats(MailchimpObject stats) {
		this.stats = stats;
	}

	public String getIp_signup() {
		return ip_signup;
	}

	public void setIp_signup(String ip_signup) {
		this.ip_signup = ip_signup;
	}

	public String getTimestamp_signup() {
		return timestamp_signup;
	}

	public void setTimestamp_signup(String timestamp_signup) {
		this.timestamp_signup = timestamp_signup;
	}

	public String getIp_opt() {
		return ip_opt;
	}

	public void setIp_opt(String ip_opt) {
		this.ip_opt = ip_opt;
	}

	public String getTimestamp_opt() {
		return timestamp_opt;
	}

	public void setTimestamp_opt(String timestamp_opt) {
		this.timestamp_opt = timestamp_opt;
	}

	public Integer getMember_rating() {
		return member_rating;
	}

	public void setMember_rating(Integer member_rating) {
		this.member_rating = member_rating;
	}

	public String getLast_changed() {
		return last_changed;
	}

	public void setLast_changed(String last_changed) {
		this.last_changed = last_changed;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public String getEmail_client() {
		return email_client;
	}

	public void setEmail_client(String email_client) {
		this.email_client = email_client;
	}

	public MailchimpObject getLocation() {
		return location;
	}

	public void setLocation(MailchimpObject location) {
		this.location = location;
	}

	public MailchimpObject getLast_note() {
		return last_note;
	}

	public void setLast_note(MailchimpObject last_note) {
		this.last_note = last_note;
	}

	public String getList_id() {
		return list_id;
	}

	public void setList_id(String list_id) {
		this.list_id = list_id;
	}

	public List<MailchimpObject> get_links() {
		return _links;
	}

	public void set_links(List<MailchimpObject> _links) {
		this._links = _links;
	}
	
}
