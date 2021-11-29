package com.java.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.bean.MyBusinessService;
 
@Configuration
public class businessConfig {

	 @Bean(name="bussService")
	    public MyBusinessService getBusinessService(){
	        return new MyBusinessService();
	    }
}
