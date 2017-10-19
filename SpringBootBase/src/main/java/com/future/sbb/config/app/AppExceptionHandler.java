package com.future.sbb.config.app;

import com.future.sbb.config.exception.InnerException;
import com.future.sbb.config.model.ErrorResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see AppExceptionHandler
 * @since 2017/10/16
 */
@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = InnerException.class)
    @ResponseBody
    public ErrorResponseEntity innerErrorHandler(HttpServletRequest req, InnerException e) throws Exception {
        return ErrorResponseEntity.create(1, e);
    }
}
