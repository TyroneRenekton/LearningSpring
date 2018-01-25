package com.spring.abstractbeandefinition.abstract1;

import com.spring.abstractbeandefinition.autowire.Auto;
import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author hms
 * @date 2018/1/18 下午4:34
 * @desc
 */

public abstract class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Lookup
    public void goSchool(int id) {

    }
}
