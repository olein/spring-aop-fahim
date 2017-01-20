package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
/**
 *
 * @author Fahim Fahad
 */
@Aspect
public class EmployeeAfterAspect {

        @After("execution(* getName())")
        public void logStringArguments(){
		System.out.println("Running After Advice.");
	}
        
//	@AfterThrowing("within(com.spring.aop.Employee)")
//	public void logExceptions(JoinPoint joinPoint){
//		System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
//	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString){
		System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
	}
	
}
