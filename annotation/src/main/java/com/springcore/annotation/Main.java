package com.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.annotation")

public class Main {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.springcore.annotation");
		
		Bank bank=context.getBean("bank",Bank.class);
		
		bank.showInfo();
		
		bank.dept.showDept();
	}
}
