package com.spring.scope.implementation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext cont = new ClassPathXmlApplicationContext("customerappscope.xml");
		CustomerApp customerapp1 = cont.getBean("customerapp1", CustomerApp.class);
		customerapp1.setProductId(1001);
		customerapp1.setName("Roza");
		customerapp1.setProductPurchase("Television");

		System.out.println(
				customerapp1.getName() + "\t" + customerapp1.getProductId() + "\t" + customerapp1.getProductPurchase());

		CustomerApp customerapp = cont.getBean("customerapp1", CustomerApp.class);

		System.out.println(
				customerapp.getName() + "\t" + customerapp.getProductId() + "\t" + customerapp.getProductPurchase());
		((AbstractApplicationContext) cont).close();
	}

}
