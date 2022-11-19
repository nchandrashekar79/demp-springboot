package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
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
}
