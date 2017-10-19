package com.future.sbb.web.controller;

import com.future.sbb.config.exception.InnerException;
import com.future.sbb.web.model.HelloEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see HelloController
 * @since 2017/9/25
 */

@RestController
@RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
public class HelloController {

    @RequestMapping(value = "/hello")
    public HelloEntity hello() throws InnerException {
        throw new InnerException("内部错误");
    }
}
