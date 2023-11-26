package org.hem.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee);
    }
}
