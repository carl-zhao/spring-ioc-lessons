package com.segmentfault.spring.ioc.beans.xml;

import com.segmentfault.spring.ioc.pogo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link XmlBeanTest }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see XmlBeanTest
 * @since 1.0.0 2017-11-05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:xml-bean.xml"})
public class XmlBeanTest implements ApplicationContextAware {

    private ApplicationContext context;

    @Test
    public void testXmlBean() {
        User user = context.getBean(User.class);
        Assert.assertEquals("Spring xml依赖注入失败:" + user.getName(),"carl", user.getName());
        Assert.assertEquals("Spring xml依赖注入失败:" + user.getCar().getPrice(), "red", user.getCar().getColor());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
