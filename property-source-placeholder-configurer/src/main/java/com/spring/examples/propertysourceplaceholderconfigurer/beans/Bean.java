package com.spring.examples.propertysourceplaceholderconfigurer.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bean {
    @Value("${foo.bar}")
    private String val;

    @Autowired
    Environment env;

    @PostConstruct
    private void test() {
        System.out.println(val);
        System.out.println(env.getProperty("foo.bar"));

        // Expected : ${foo.bar}\nbaz
        // Actual : baz\nbaz
    }
}
