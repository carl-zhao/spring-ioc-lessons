package com.segmentfault.spring.ioc.pogo;

import java.io.Serializable;

/**
 * {@link User }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see User
 * @since 1.0.0 2017-11-05
 */
public class User implements Serializable {

    private int id;
    private String name;
    private Car car;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
