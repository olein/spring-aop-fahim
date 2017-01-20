package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * @author Fahim Fahad
 */
@Component
public class SpringAOPTest {
    
    @Autowired
    static EmployeeService employeeService;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.config.xml");

        employeeService = ctx.getBean("employeeService", EmployeeService.class);
        //employeeService.getEmployee().setName("fahim fahad");
        System.out.println(employeeService.getEmployee().getName());

        //employeeService.getEmployee().setName("Pankaj");

       // employeeService.getEmployee().throwException();  
        ctx.close();
    }

}
