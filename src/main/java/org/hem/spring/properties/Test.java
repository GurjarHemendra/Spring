package org.hem.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("main/java/org/hem/spring/properties/springproperties.xml");
        India india= (India) ctx.getBean("india");
        System.out.println(india);
    }

}
