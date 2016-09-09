package ar.com.mailchimp.method.v3_0.lists;

import java.util.List;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.QueryStringParam;

@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/lists")
public class GetListsMethod extends MailchimpMethod<GetListsResponse>{

	@QueryStringParam
	private List<MailchimpObject> fields;
	
	@QueryStringParam
	private List<MailchimpObject> exclude_fields;
	
	@QueryStringParam
	private Integer count;
	
	@QueryStringParam
	private Integer offset;
	
	@QueryStringParam
	private String before_date_created;
	
	@QueryStringParam
	private String since_date_created;
	
	@QueryStringParam
	private String before_campaign_last_sent;
	
	@QueryStringParam
	private String since_campaign_last_sent;
	
	@QueryStringParam
	private String email;

	
	public List<MailchimpObject> getFields() {
		return fields;
	}

	public void setFields(List<MailchimpObject> fields) {
		this.fields = fields;
	}

	public List<MailchimpObject> getExclude_fields() {
		return exclude_fields;
	}

	public void setExclude_fields(List<MailchimpObject> exclude_fields) {
		this.exclude_fields = exclude_fields;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public String getBefore_date_created() {
		return before_date_created;
	}

	public void setBefore_date_created(String before_date_created) {
		this.before_date_created = before_date_created;
	}

	public String getSince_date_created() {
		return since_date_created;
	}

	public void setSince_date_created(String since_date_created) {
		this.since_date_created = since_date_created;
	}

	public String getBefore_campaign_last_sent() {
		return before_campaign_last_sent;
	}

	public void setBefore_campaign_last_sent(String before_campaign_last_sent) {
		this.before_campaign_last_sent = before_campaign_last_sent;
	}

	public String getSince_campaign_last_sent() {
		return since_campaign_last_sent;
	}

	public void setSince_campaign_last_sent(String since_campaign_last_sent) {
		this.since_campaign_last_sent = since_campaign_last_sent;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
