package com.kodilla.lifecycle;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Homework implements BeanPostProcessor {

    Logger logger = Logger.getLogger(Homework.class);

    public Homework(){
        BasicConfigurator.configure();
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("Bean named: " + beanName + " was successfully created at: " + LocalDateTime.now().toString());
        return bean;
    }
}
