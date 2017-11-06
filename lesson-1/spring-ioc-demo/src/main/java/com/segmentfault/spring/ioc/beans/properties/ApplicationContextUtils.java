package com.segmentfault.spring.ioc.beans.properties;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * {@link ApplicationContextUtils }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see ApplicationContextUtils
 * @since 1.0.0 2017-11-05
 */
@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static Object getBean(String name) throws BeansException {
        if(context == null) {
            throw new RuntimeException("context is null");
        }
        return context.getBean(name);
    }

    public static <T> T getBean(Class<T> requiredType) throws BeansException{
        if(context == null) {
            throw new RuntimeException("context is null");
        }
        return context.getBean(requiredType);
    }

}
