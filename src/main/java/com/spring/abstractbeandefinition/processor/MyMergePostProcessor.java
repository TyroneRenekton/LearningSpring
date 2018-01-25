package com.spring.abstractbeandefinition.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author hms
 * @date 2018/1/25 下午2:37
 * @desc
 */
@Component
public class MyMergePostProcessor implements MergedBeanDefinitionPostProcessor{
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition rootBeanDefinition, Class<?> aClass, String s) {
        //System.out.println(rootBeanDefinition.getBeanClassName() + " " + "merge");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        //System.out.println(o.getClass().getName() + " " + "before");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        //System.out.println(o.getClass().getName() + " " + "after");
        return o;
    }
}
