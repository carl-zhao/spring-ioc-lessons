package com.segmentfault.spring.ioc.reflect;

import com.segmentfault.spring.ioc.pogo.User;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * {@link ReflectDemo }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see ReflectDemo
 * @since 1.0.0 2017-11-05
 */
public class ReflectDemo {

    @Test
    public void testMethod() throws Exception {
        User user = new User();
        Class<? extends User> clazz = user.getClass();
        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(user, "carl");
        Assert.assertEquals("反射调用失败!", "carl", user.getName());
    }

    @Test
    public void testField() throws Exception {
        User user = new User();
        Class<? extends User> clazz = user.getClass();
        Field idField = clazz.getDeclaredField("id");
        idField.setAccessible(true);
        idField.set(user, 1);
        Assert.assertEquals("反射调用失败!", 1, user.getId());
    }

}
