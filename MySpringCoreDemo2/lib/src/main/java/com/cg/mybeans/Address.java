package com.cg.mybeans;

import org.springframework.stereotype.Component;
//@Component  // wherever it fins autowired it inject object into that class
public class Address {
	
	public Address() {
		System.out.println("Address Object is Created");
	}

}
