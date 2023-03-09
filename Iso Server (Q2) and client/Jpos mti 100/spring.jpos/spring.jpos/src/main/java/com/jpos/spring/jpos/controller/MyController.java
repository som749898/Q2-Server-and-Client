package com.jpos.spring.jpos.controller;

import org.jpos.iso.ISOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpos.spring.jpos.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService service;
	
	@GetMapping("/echo")
	public String echo() throws ISOException{
		return this.service.response();
	}
}
