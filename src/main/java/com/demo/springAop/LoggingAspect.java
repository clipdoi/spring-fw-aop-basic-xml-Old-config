package com.demo.springAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethod()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		
	}
	
	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method that takes String arguments has been called. The value is " + name + " The output value is "+ returnString);
	}
	
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("An exception has been thrown " + ex);
	}
	
	@Around("@annotation(com.demo.springAop.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint point) {
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			point.proceed();
			System.out.println("After returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After finally");
		return returnValue; 
	}
	
	@Pointcut("execution(* get*())")
	public void allGetter() {	
	}
	
	@Pointcut("within(com.demo.springAop.Circle)")
	public void allCircleMethod() {}
}
