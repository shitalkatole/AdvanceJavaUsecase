package com.springcore.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
public interface Department {

	public void showDept();
}
