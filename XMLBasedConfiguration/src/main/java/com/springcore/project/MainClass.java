package com.springcore.project;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Mobile.xml");
		Mobile m1 = (Mobile) context.getBean("M1");
		System.out.println(m1);
		context.registerShutdownHook();
	}

}
