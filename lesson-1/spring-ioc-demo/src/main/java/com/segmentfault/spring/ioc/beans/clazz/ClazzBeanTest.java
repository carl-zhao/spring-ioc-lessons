package com.segmentfault.spring.ioc.beans.clazz;

import com.segmentfault.spring.ioc.beans.annotation.Computer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link ClazzBeanTest }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see ClazzBeanTest
 * @since 1.0.0 2017-11-05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ClazzBeanConfig.class})
public class ClazzBeanTest implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Test
    public void testClazzBean(){
        Computer computer = context.getBean(Computer.class);
        Assert.assertEquals("Spring class注入失败","carl", computer.getOwner().getName());
    }

}
