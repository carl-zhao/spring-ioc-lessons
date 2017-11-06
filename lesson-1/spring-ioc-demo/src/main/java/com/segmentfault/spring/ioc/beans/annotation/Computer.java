package com.segmentfault.spring.ioc.beans.annotation;

import com.segmentfault.spring.ioc.pogo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * {@link Computer }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see Computer
 * @since 1.0.0 2017-11-05
 */
@Component
public class Computer {

    @Autowired
    private User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
