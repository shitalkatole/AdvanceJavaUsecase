package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	
	@Value("SBI")
	String bankName;
     
	@Lazy
	@Autowired
	@Qualifier("issueDept")
	Department dept;
     
	public void showInfo() {
		System.out.println("Welcome to " +bankName);
		System.out.println("bank details are as follows : ");
	}
}
