package com.spring.abstractbeandefinition.autowire;

import com.spring.abstractbeandefinition.abstract1.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hms
 * @date 2018/1/18 下午5:08
 * @desc
 */

public class Auto {

    public Auto(){
        System.out.println("=========auto=====");
    }
    @Autowired
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
