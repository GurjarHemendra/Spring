package org.hem.spring.pschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ct= new ClassPathXmlApplicationContext("main/java/org/hem/spring/pschema/springpschema.xml");
        Hospital hos= (Hospital) ct.getBean("hospital");
        System.out.println(hos);
    }
}
