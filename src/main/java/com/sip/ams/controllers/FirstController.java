package com.sip.ams.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@GetMapping("/info")
	//@ResponseBody
	public String info() {
		return "first/info";
	}
	
	@GetMapping("/details")
	//@ResponseBody
	public String detail() {
		return "first/detail";
	}


}
