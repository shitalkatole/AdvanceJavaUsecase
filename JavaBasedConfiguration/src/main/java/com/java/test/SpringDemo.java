package com.java.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.bean.MyBusinessService;
import com.java.bean.MyJdbcService;
import com.java.config.MyAppConfig;
 
public class SpringDemo {

	 public static void main(String a[]){
		 
	        @SuppressWarnings("resource")
	        ApplicationContext context = 
	                new AnnotationConfigApplicationContext(MyAppConfig.class);
	        MyJdbcService jdbc = (MyJdbcService) context.getBean("jdbcService");
	        jdbc.createJdbcConnection();
	        MyBusinessService busServ = (MyBusinessService) context.getBean("bussService");
	        busServ.runMyBusiness();
	    }
}
