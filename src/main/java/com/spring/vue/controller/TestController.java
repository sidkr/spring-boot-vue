package com.spring.vue.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.vue.model.Response;

@RestController
@RequestMapping("api")
@CrossOrigin
public class TestController {

	@GetMapping("/message")
	public Response sendResponse() {
		Response r = new Response();
		r.setResponseCode(200);
		r.setResponseText("Hello world from the server...");
		
		return r;
	}
	
	
}
