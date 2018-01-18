package com.promonkey.controller;

import com.spring.abstractbeandifition.abstract1.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hms
 * @date 2018/1/18 下午4:40
 * @desc
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");

        Student student = (Student)applicationContext.getBean("student");

        System.out.println(student.getName());
    }
}
