package com.segmentfault.spring.ioc.validator;

import org.springframework.core.MethodParameter;

/**
 * <p>todo</p>
 *
 * @author zhaoyong
 * @version $Id: ValidatorService , v 0.1  K555 Exp $
 * @date 2017年11月07 13:33
 */
public interface ValidatorService {

    boolean canValidator(MethodParameter parameter);

    void validate(Object fieldValue, MethodParameter parameter);


}
