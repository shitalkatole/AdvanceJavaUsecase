package com.springcore.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class budgetDept implements Department{

		public void showDept() {
		System.out.println("budget dept  details are as follows");	
	}

}
