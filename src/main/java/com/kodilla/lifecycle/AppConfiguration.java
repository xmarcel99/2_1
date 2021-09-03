package com.kodilla.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public BeanMonitor beanMonitor() {
        return new BeanMonitor();
    }

    @Bean
    public Homework homeworkBean() {
        return new Homework();
    }

    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }

}
