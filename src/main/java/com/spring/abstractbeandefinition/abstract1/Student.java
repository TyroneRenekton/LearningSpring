package com.spring.abstractbeandefinition.abstract1;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

/**
 * @author hms
 * @date 2018/1/18 下午4:40
 * @desc
 */
public class Student extends Person implements InitializingBean{

    @Autowired
    public ResourceLoader resourceLoader;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterpropertiesset");
    }

    public void init() {
        System.out.println("init-methodname");
    }
}
