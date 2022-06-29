package com.assurity.api.test.init;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assurity.api.response.pojo.Root;
import com.assurity.api.util.RestServiceInvoker;
import com.jayway.jsonpath.JsonPath;

/**
 * 
 * @author Diwakar.B
 * @version 1.0 
 */
public class FunctionalTest {

	private static final String JSON_PATH_EXP = "$.Promotions.[?(@.Name=='Gallery')]";
	public static final String GET_API_URI = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
	
	// Use case to simply validate if the service is available
    @Test
    public void getCategoryDetails_200ResponceReceived_BasicSuccessTest()
            throws ClientProtocolException, IOException {
       String endpoint = GET_API_URI;
       HttpResponse response= RestServiceInvoker.get(endpoint); 
       Assert.assertEquals(
    		   response.getStatusLine().getStatusCode(),
                HttpStatus.SC_OK);
    }
    
    // The core assignment usecase 
    @Test
    public void getCategoryDetails_validateElementValues_SuccessTest()
            throws ClientProtocolException, IOException {
       String endpoint = GET_API_URI;
       Root response= RestServiceInvoker.get(endpoint, Root.class); 
       
       //Approach 1 is to validate response by converting into an object
       Assert.assertEquals(response.getName(), "Carbon credits");						// Assertion 1
       Assert.assertEquals(response.isCanRelist(), true);								// Assertion 2
       
       //Approach 2 is to validate response by using the jsonpath using jayway
       HttpResponse httpResponse= RestServiceInvoker.get(endpoint); 
       String responsePayload = EntityUtils.toString(httpResponse.getEntity());
       String jsonPathExpression = JSON_PATH_EXP;
       ArrayList jsonValue = JsonPath.parse(responsePayload).read(jsonPathExpression, ArrayList.class);
       LinkedHashMap promotion = (LinkedHashMap) jsonValue.get(0);
       String descr = (String)promotion.get("Description");
       Assert.assertTrue(descr.contains("Good position in category"));					// Assertion 3
    }
}
