package com.segmentfault.spring.ioc.validator;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>todo</p>
 *
 * @author zhaoyong
 * @version $Id: TestController , v 0.1  K555 Exp $
 * @date 2017年11月07 13:31
 */
@Controller
public class TestController {

    @RequestMapping("test/{age}")
    @ResponseBody
    public String test(@CustomPathVariable("age") @Range(min = 0, max = 150, message = "年龄非法") String age){
        System.out.println(age);
        return "success";
    }

}
