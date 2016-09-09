package ar.com.mailchimp.method.v3_0.members;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.Field;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.PathParam;
import com.ecwid.maleorang.annotation.QueryStringParam;

@Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/lists/{list_id}/members")
public class AddMemberMethod extends MailchimpMethod<MemberInfo> {

	@PathParam
	private String list_id;
	
	@Field
	private String email_type;
	
	@Field
	private String status;
	
	@Field
	private MailchimpObject merge_fields;
	
	@Field
	private MailchimpObject interests;
	
	@Field
	private String language;
	
	@Field
	private Boolean vip;
	
	@Field
	private MailchimpObject location;
	
	@Field
	private String ip_signup;
	
	@Field
	private String timestamp_signup;
	
	@Field
	private String ip_opt;
	
	@Field
	private String timestamp_opt;
	
	@Field
	private String email_address;

	
	public String getList_id() {
		return list_id;
	}

	public void setList_id(String list_id) {
		this.list_id = list_id;
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

	public MailchimpObject getLocation() {
		return location;
	}

	public void setLocation(MailchimpObject location) {
		this.location = location;
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

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	
}
