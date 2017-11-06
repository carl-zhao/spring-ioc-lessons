package com.segmentfault.spring.ioc.token;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link BeanTokenTest }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see BeanTokenTest
 * @since 1.0.0 2017-11-05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:token-bean.xml"})
public class BeanTokenTest implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Test
    public void testBeanToken(){
        Man man = context.getBean(Man.class);
        Assert.assertEquals(3, man.getArray().size());
        System.out.println(man.getArray());
        Assert.assertEquals(3, man.getList().size());
        System.out.println(man.getList());
    }

}
