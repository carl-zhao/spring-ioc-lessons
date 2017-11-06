package com.segmentfault.spring.ioc.pogo;

/**
 * {@link Student }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see Student
 * @since 1.0.0 2017-11-05
 */
public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
