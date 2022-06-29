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

public class FunctionalTest {

    @Test
    public void getCategoryDetails_200ResponceReceived_BasicSuccessTest()
            throws ClientProtocolException, IOException {
    	
       String endpoint = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
       HttpResponse response= RestServiceInvoker.get(endpoint); 
       Assert.assertEquals(
    		   response.getStatusLine().getStatusCode(),
                HttpStatus.SC_OK);
    }
    
    @Test
    public void getCategoryDetails_validateElementValues_BasicSuccessTest()
            throws ClientProtocolException, IOException {
    	
       String endpoint = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
       Root response= RestServiceInvoker.get(endpoint, Root.class); 
       //Approach 1 is to validate response by converting into an object
       Assert.assertEquals(response.getName(), "Carbon credits");
       Assert.assertEquals(response.isCanRelist(), true);
       
       //Approach 2 is to validate response by using the jsonpath
       HttpResponse httpResponse= RestServiceInvoker.get(endpoint); 
       String responsePayload = EntityUtils.toString(httpResponse.getEntity());
       String jsonPathExpression = "$.Promotions.[?(@.Name=='Gallery')]";
       ArrayList jsonValue = JsonPath.parse(responsePayload).read(jsonPathExpression, ArrayList.class);
       LinkedHashMap promotion = (LinkedHashMap) jsonValue.get(0);
       String descr = (String)promotion.get("Description");
       Assert.assertTrue(descr.contains("Good position in category"));
    }
}
