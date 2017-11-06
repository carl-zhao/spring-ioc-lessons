package com.segmentfault.spring.ioc.token;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link Man }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see Man
 * @since 1.0.0 2017-11-05
 */
public class Man {

    private List<String> array = new ArrayList<String>() {
        {
            add("a");
            add("b");
            add("c");
        }
    };

    private List<String> list;

    public List<String> getArray() {
        return array;
    }

    public void setArray(List<String> array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
