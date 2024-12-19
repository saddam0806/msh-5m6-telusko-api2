package com.telusko.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Telusko2Controller 
{
	@GetMapping("/moreinfo")
	public String getMoreCourseInfo()
	{
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> re = template.getForEntity("http://localhost:8484/info", String.class);
		String apiResponse=re.getBody();
		return apiResponse+ "  This course starts on 9th Aug and 7 am IST to 8:30 am IST MON-Fri";
	}

}
