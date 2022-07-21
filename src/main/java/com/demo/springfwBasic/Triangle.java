package com.demo.springfwBasic;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	


	public Point getPointA() {
		return pointA;
	}




	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}




	public Point getPointB() {
		return pointB;
	}




	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}




	public Point getPointC() {
		return pointC;
	}




	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}




	public void draw() {
		
			System.out.println("Point A have x ="+getPointA().getX());
		
			
	}


	
}
