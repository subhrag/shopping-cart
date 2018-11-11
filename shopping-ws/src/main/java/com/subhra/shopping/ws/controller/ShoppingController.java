package com.subhra.shopping.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ShoppingController {

	@GetMapping("/products")
	public String getProducts() {
		return "test";
	}
}
