package com.sarfaraz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/")
public class AppTestController {

	@GetMapping("test")
	public String appListening() {
		return "Congrats.! App is running.....";
	}
	
	@GetMapping("updated")
	public String app() {
		return "Congrats.! App updated.....";
	}
}
