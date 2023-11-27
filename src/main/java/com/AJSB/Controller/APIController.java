package com.AJSB.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class APIController {

	@GetMapping("/apiList")
	 public String getAPIList()
	 {
		 
		 return "hello world";
	 }
	
}
