package com.spring.abstractbeandefinition.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hms
 * @date 2018/1/25 下午2:47
 * @desc
 */
@Component("myb")
public class B {

    public static B b = new B();

    @Resource(name = "mya")
    public A a;
}
