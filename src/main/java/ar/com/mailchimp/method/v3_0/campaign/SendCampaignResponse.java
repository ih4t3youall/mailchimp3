package ar.com.mailchimp.method.v3_0.campaign;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class SendCampaignResponse extends MailchimpObject{

	@Field
	private String type;
	
	@Field
	private String title;
	
	@Field
	private Integer status;
	
	@Field
	private String detail;
	
	@Field
	private String instance;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

}
