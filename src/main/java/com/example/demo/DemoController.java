package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaomingning
 * @date 10/15/2020.
 */

@RestController
public class DemoController {

	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello world from kubernetes!";
	}
}
