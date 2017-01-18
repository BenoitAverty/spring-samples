package com.spring.examples.propertysourceplaceholderconfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:some.properties")
@ComponentScan("com.spring.examples.propertysourceplaceholderconfigurer.beans")
public class Config {
}
