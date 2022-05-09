package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lt.crs.controller.Client2Controller;
@Component
public class ExampleController {

	@Autowired
	private Client2Controller c2c;
	
	public ExampleController() {
		System.out.println("hello example controller");
	}
}
