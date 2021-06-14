package com.cg.mybeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Employee {

		Address addr;
		public Employee(){
			System.out.println("Employee Object is Created ");
		}
		public Address getAddr() {
			return addr;
		}
		@Autowired // this call the setter method for me and inject the Address object 
		public void setAddr(Address addr) {
			this.addr = addr;
			System.out.println("Adress Object is Inserted ");
		}
		
}



