package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld hw = (HelloWorld)appContext.getBean("helloWorld");
		hw.getMessage();
	}
}
