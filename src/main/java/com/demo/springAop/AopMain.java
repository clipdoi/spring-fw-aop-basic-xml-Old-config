package com.demo.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = (ShapeService) ctx.getBean("shapeService", ShapeService.class);
//		System.out.println(service.getCircle().getName());
//		service.getCircle().setName("sdafadsadfasdf");
		service.getCircle();
	}

}
