package ar.com.mailchimp.method.v3_0.templates;

import java.util.List;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.MailchimpObject;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;
import com.ecwid.maleorang.annotation.QueryStringParam;

@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/templates")
public class GetTemplatesMethod extends MailchimpMethod<GetTemplatesResponse> {

	@QueryStringParam
	private List<MailchimpObject> fields;
	
	@QueryStringParam
	private List<MailchimpObject> exclude_fields;
	
	@QueryStringParam
	private Integer count;
	
	@QueryStringParam
	private Integer offset;
	
	@QueryStringParam
	private String created_by;
	
	@QueryStringParam
	private String since_created_at;
	
	@QueryStringParam
	private String before_created_at;
	
	@QueryStringParam
	private String type;
	
	@QueryStringParam
	private String folder_id;

}
