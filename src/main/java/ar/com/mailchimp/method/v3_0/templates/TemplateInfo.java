package ar.com.mailchimp.method.v3_0.templates;

import java.util.List;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class TemplateInfo extends MailchimpObject{

	@Field
	private Integer id;
	
	@Field
	private String type;
	
	@Field
	private String name;
	
	@Field
	private Boolean drag_and_drop;
	
	@Field
	private Boolean responsive;
	
	@Field
	private String category;
	
	@Field
	private String date_created;
	
	@Field
	private String created_by;
	
	@Field
	private Boolean active;
	
	@Field
	private String folder_id;
	
	@Field
	private String thumbnail;
	
	@Field
	private String share_url;
	
	@Field
	private List<MailchimpObject> _links;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDrag_and_drop() {
		return drag_and_drop;
	}
	public void setDrag_and_drop(boolean drag_and_drop) {
		this.drag_and_drop = drag_and_drop;
	}
	public boolean isResponsive() {
		return responsive;
	}
	public void setResponsive(boolean responsive) {
		this.responsive = responsive;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getFolder_id() {
		return folder_id;
	}
	public void setFolder_id(String folder_id) {
		this.folder_id = folder_id;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShare_url() {
		return share_url;
	}
	public void setShare_url(String share_url) {
		this.share_url = share_url;
	}
	public List<MailchimpObject> get_link() {
		return _links;
	}
	public void set_link(List<MailchimpObject> _links) {
		this._links = _links;
	}
	
	
	
	
}
