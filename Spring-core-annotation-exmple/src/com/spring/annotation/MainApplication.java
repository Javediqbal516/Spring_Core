package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
		
		SuccerCouch obj = context.getBean("A", SuccerCouch.class);
		
		System.out.println(obj.doPractic());
		System.out.println(obj.doRest());
		System.out.println(obj.playersworkout());
		System.out.println("===================================\n");
		
		ValiballCouch obj1 = context.getBean("B", ValiballCouch.class);
		System.out.println(obj1.doPractic());
		System.out.println(obj1.doRest());
		System.out.println(obj1.playerstrainday());

	}

}
