package com.spring.examples.propertysourceplaceholderconfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        String[] beans =  ctx.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            System.out.println(beans[i]);
        }
    }
}
