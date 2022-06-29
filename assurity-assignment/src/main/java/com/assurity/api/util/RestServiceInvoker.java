package com.assurity.api.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Utility class for centrally performing all REST API invocations.
 * Can be used by all the test suits. 
 * 
 * @author Diwakar.B
 * @version 1.0 
 */
public class RestServiceInvoker {

	/**
	 * Invokes a GET method for a REST service. Provides the response as a POJO for
	 * the expected response type.
	 * 
	 * @param <T>
	 * @param url
	 * @param clazz
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static <T> T get(String url, Class<T> clazz) throws ClientProtocolException, IOException {
		HttpUriRequest request = new HttpGet(url);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
		ObjectMapper om = new ObjectMapper();
		String response = EntityUtils.toString(httpResponse.getEntity());
		T readValue = om.readValue(response, clazz);
		return readValue;
	}

	/**
	 * Invokes a GET method for a REST service. Returns the HttpResponse.
	 * 
	 * @param url
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static HttpResponse get(String url) throws ClientProtocolException, IOException {
		HttpUriRequest request = new HttpGet(url);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
		return httpResponse;
	}

}
