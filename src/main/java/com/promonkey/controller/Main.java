package com.promonkey.controller;

import com.spring.abstractbeandefinition.abstract1.Student;
import com.spring.abstractbeandefinition.autowire.Auto;
import com.spring.abstractbeandefinition.circular.A;
import com.spring.abstractbeandefinition.circular.B;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author hms
 * @date 2018/1/18 下午4:40
 * @desc
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");

        Student student = (Student) applicationContext.getBean("student");

        applicationContext.destroy();
    }
}
