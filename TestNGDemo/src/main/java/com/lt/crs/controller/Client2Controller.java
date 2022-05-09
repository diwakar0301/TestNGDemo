package com.lt.crs.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Client2Controller {
	
	public Client2Controller(){
		System.out.println("hello client2controller constructor");
	}
	public String fun1() {
		System.out.println("hello fun1");
		return "fun 1";
	}

	
	public String a() {
		System.out.println("hello method a");
		return "hello method a";
	}
	
	
	public void b() throws NullPointerException{
		System.out.println("hello method b");
		throw new NullPointerException("exc");
		
	}
	
}
