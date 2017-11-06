package com.segmentfault.spring.ioc.introspector;

import com.segmentfault.spring.ioc.pogo.User;
import com.segmentfault.spring.ioc.support.DateEditor;
import org.junit.Assert;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * {@link IntrospectorDemo }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see IntrospectorDemo
 * @since 1.0.0 2017-11-05
 */
public class IntrospectorDemo {

    @Test
    public void testMethod() throws Exception {
        User user = new User();

        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            if("name".equals(propertyDescriptor.getName())) {
                Method writeMethod = propertyDescriptor.getWriteMethod();
                writeMethod.invoke(user, "carl");

                Method readMethod = propertyDescriptor.getReadMethod();
                String name = (String) readMethod.invoke(user);
                Assert.assertEquals("调用内省失败", name, "carl");
                break;
            }
        }
    }

    @Test
    public void testPropertyEditor() throws Exception {
        DateEditor dateEditor = new DateEditor();
        dateEditor.setAsText("2017-11-05 20:00:00");
        Object value = dateEditor.getValue();
        Assert.assertEquals("调用内省失败", Date.class, value.getClass());
    }

}
