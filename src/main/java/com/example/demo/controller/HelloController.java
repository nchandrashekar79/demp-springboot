package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/test")
	public String test() throws UnknownHostException {
		String hostAddr = "empty";
		InetAddress ip = InetAddress.getLocalHost();
		hostAddr ="My IP address is: "+ ip.getHostAddress();
		System.out.print(hostAddr);
		return hostAddr;
	}
	
	
	@GetMapping("/api/{id}")
	@ResponseBody
	public String getEmployeesById(@PathVariable String id) {
	    return "ID: " + id;
	}
}
