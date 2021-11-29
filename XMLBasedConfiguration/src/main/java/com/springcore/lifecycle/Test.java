package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
		context.registerShutdownHook();
		Book b1 = (Book) context.getBean("b1");
		System.out.println(b1);

		System.out.println("--------------------");
		Author A1 = (Author) context.getBean("A1");
		System.out.println(A1);

		Example example = (Example) context.getBean("example");

		System.out.println(example);

	}

}
