package com.sift.app.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class APIController {

private static Logger LOG=Logger.getLogger(APIController.class.getName());
	
	
	
	@GetMapping("/marketData")
	public String getMarketData()
	{
		LOG.info("Calling Get getMarketData");
		final String uri = "https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-summary?region=India&lang=en";
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("content-type","application/json");
	    headers.add("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com");
	    headers.add("x-rapidapi-key", "b7051783fbmsh1d68e27ecb47498p1c1ff4jsn9f4ed57459e2");
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	    String response=result.getBody();
	    return response;
	}
	
}
