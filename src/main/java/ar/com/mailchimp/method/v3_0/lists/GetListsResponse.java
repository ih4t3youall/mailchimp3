package ar.com.mailchimp.method.v3_0.lists;

import java.util.List;

import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.Field;

public class GetListsResponse extends MailchimpObject {

	@Field
	private List<MailchimpObject> lists;
	@Field
	private Integer total_items;
	@Field
	private List<MailchimpObject> _links;

	public List<MailchimpObject> getLists() {
		return lists;
	}

	public void setLists(List<MailchimpObject> lists) {
		this.lists = lists;
	}

	public Integer getTotal_items() {
		return total_items;
	}

	public void setTotal_items(Integer total_items) {
		this.total_items = total_items;
	}

	public List<MailchimpObject> get_links() {
		return _links;
	}

	public void set_links(List<MailchimpObject> _links) {
		this._links = _links;
	}

}
