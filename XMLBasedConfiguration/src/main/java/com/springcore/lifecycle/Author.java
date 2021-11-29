package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Author implements InitializingBean, DisposableBean {

	private String Authorname;

	public String getAuthorname() {
		return Authorname;
	}

	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}

	@Override
	public String toString() {
		return "Author [Authorname=" + Authorname + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initialising author : init");
		
	}

	
}
