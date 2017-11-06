package com.segmentfault.spring.ioc.beans.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link AnnotationBeanTest }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see AnnotationBeanTest
 * @since 1.0.0 2017-11-05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:annotation-bean.xml"})
public class AnnotationBeanTest implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Test
    public void testAnnotationBean() {
        Computer computer = context.getBean(Computer.class);
        Assert.assertEquals("Spring 注解注入失败" + computer.getOwner().getName(),"xiaomage", computer.getOwner().getName());
    }

}
