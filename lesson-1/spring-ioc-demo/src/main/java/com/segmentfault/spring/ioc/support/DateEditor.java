package com.segmentfault.spring.ioc.support;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * {@link DateEditor }
 *
 * @author <a href="mailto:zhaoyong_carl@sina.com">Mercy<a/>
 * @version 1.0.0
 * @see DateEditor
 * @since 1.0.0 2017-11-05
 */
public class DateEditor extends PropertyEditorSupport {

    private String pattern = "yyyy-mm-dd HH:mm:SS";

    public DateEditor() {
        super();
    }

    public void setAsText(String value) {
        DateFormat format = new SimpleDateFormat(pattern);
        try {
            Date date = format.parse(value);
            super.setValue(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
