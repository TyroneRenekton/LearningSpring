package com.spring.abstractbeandefinition.factorybean;

import com.spring.abstractbeandefinition.autowire.Auto;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import sun.tools.tree.NewArrayExpression;

/**
 * @author hms
 * @date 2018/1/20 下午4:34
 * @desc
 */
public class MyFactoryBean implements FactoryBean<Auto>{

    @Override
    public Auto getObject() throws Exception {
        return new Auto();
    }

    @Override
    public Class<?> getObjectType() {
        return Auto.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
