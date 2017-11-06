package com.segmentfault.spring.ioc.beans.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@link Woman }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see Woman
 * @since 1.0.0 2017-11-05
 */
@ConfigurationProperties(prefix = "spring.properties.bean")
public class Woman {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
