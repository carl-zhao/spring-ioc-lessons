package com.segmentfault.spring.ioc.validator;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>todo</p>
 *
 * @author zhaoyong
 * @version $Id: MVCConfig , v 0.1  K555 Exp $
 * @date 2017年09月26 19:09
 */
@Configuration
@EnableWebMvc
public class MVCConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        CustomerPathVariableMethodArgumentResolver messageConverter = new CustomerPathVariableMethodArgumentResolver();


        // 添加自己的自定义Validator
        List<ValidatorService> validatorServices = new ArrayList<ValidatorService>();
        validatorServices.add(new RangeValidatorService());
        messageConverter.setValidatorServices(validatorServices);


        argumentResolvers.add(messageConverter);
    }


}
