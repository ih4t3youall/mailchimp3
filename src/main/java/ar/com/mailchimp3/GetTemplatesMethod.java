package ar.com.mailchimp3;

import com.ecwid.maleorang.MailchimpMethod;
import com.ecwid.maleorang.annotation.APIVersion;
import com.ecwid.maleorang.annotation.HttpMethod;
import com.ecwid.maleorang.annotation.Method;

import ar.com.mailchimp3.entities.templates.TemplateResponse;

@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/templates")
public class GetTemplatesMethod extends MailchimpMethod<TemplateResponse> {

	
}
