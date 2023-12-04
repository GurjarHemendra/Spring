package org.hem.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("main/java/org/hem/spring/list/springlist.xml");
        Shop shop= (Shop) ctx.getBean("shop");
        System.out.println(shop);
    }
}
