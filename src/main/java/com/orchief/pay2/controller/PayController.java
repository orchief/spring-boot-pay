package com.orchief.pay2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
	
	@PostMapping("/unionpays")
	public String createOrder(@RequestParam String orderId) {
		
		// query db find order's Info
		
		
		return orderId;
	}
}
