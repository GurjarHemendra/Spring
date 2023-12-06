package org.hem.spring.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("main/java/org/hem/spring/Map/springmap.xml");
        Store s= (Store) ctx.getBean("store");
        System.out.println(s);
    }
}
