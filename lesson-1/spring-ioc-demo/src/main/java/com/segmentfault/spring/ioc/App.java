package com.segmentfault.spring.ioc;

import com.segmentfault.spring.ioc.pogo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml-bean.xml");
        context.getBean(User.class);
    }
}
