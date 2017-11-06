package com.segmentfault.spring.ioc.beans.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * {@link SpringBootRunner }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see SpringBootRunner
 * @since 1.0.0 2017-11-05
 */
@SpringBootApplication
@EnableConfigurationProperties(Woman.class)
public class SpringBootRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunner.class, args);
    }

}
