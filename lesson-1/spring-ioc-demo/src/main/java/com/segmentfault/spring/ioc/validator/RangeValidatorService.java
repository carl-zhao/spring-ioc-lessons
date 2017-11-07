package com.segmentfault.spring.ioc.validator;

import org.hibernate.validator.constraints.Range;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;

/**
 * <p>todo</p>
 *
 * @author zhaoyong
 * @version $Id: RangeValidator , v 0.1  K555 Exp $
 * @date 2017年11月07 12:42
 */
@Service
public class RangeValidatorService implements ValidatorService {

    @Override
    public boolean canValidator(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(Range.class);
    }

    @Override
    public void validate(Object fieldValue, MethodParameter parameter) {
        Range range = parameter.getParameterAnnotation(Range.class);
        long min = range.min();
        long max = range.max();

        Long value = Long.valueOf(fieldValue.toString());
        if(value > max || value < min) {
            throw new RuntimeException(range.message());
        }
    }
}
