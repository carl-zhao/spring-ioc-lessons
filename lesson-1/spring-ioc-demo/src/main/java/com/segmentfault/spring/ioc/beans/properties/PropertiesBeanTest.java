package com.segmentfault.spring.ioc.beans.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * {@link PropertiesBeanTest }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see PropertiesBeanTest
 * @since 1.0.0 2017-11-05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootRunner.class})
public class PropertiesBeanTest {

    @Test
    public void testPropertiesBean(){
        Woman woman = ApplicationContextUtils.getBean(Woman.class);
        Assert.assertEquals("Spring properties注入失败" , 20, woman.getAge());
    }

}
