package com.spring.abstractbeandefinition.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hms
 * @date 2018/1/25 下午2:47
 * @desc
 */
@Component("mya")
public class A{
    public static A a = new A();
    @Resource(name = "myb")
    public B b;
}
