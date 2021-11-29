package com.springcore.annotation;

import org.springframework.stereotype.Component;

@Component
public class IssueDept implements Department{
public void showDept() {
		System.out.println("issue dept  details are as follows :");
		
	}

}
