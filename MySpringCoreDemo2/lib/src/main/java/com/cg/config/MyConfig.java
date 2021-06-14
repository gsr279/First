package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.mybeans.Address;
import com.cg.mybeans.Employee;
@Configuration
public class MyConfig {
	@Bean
	public Address CreateAddress() {
		return new Address();
	}
	@Bean
	public Employee CreateEmployee() {
		return new Employee();
	}

}
