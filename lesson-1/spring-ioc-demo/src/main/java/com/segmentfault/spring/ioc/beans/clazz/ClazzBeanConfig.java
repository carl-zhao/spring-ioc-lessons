package com.segmentfault.spring.ioc.beans.clazz;

import com.segmentfault.spring.ioc.beans.annotation.Computer;
import com.segmentfault.spring.ioc.pogo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link ClazzBeanConfig }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see ClazzBeanConfig
 * @since 1.0.0 2017-11-05
 */
@Configuration
public class ClazzBeanConfig {

    @Bean
    public Computer computer(User user) {
        Computer computer = new Computer();
        computer.setOwner(user);
        return computer;
    }

    @Bean
    public User  user(){
        User user = new User();
        user.setId(1);
        user.setName("carl");
        return user;
    }

}
