package com.future.sbb.config.app;

import com.future.sbb.config.model.ErrorResponseEntity;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class description:http错误处理类
 *
 * @author zp
 * @version 1.0
 * @see HttpErrorHandler
 * @since 2017/10/16
 */
@RestController
public class HttpErrorHandler implements ErrorController {

    private final static String ERROR_PATH = "/error";

    /**
     * Supports other formats like JSON, XML
     *
     * @return error entity.
     */
    @RequestMapping(value = ERROR_PATH, produces = "application/json;charset=UTF-8")
    public ErrorResponseEntity error() {
        return ErrorResponseEntity.create(2, "页面不存在");
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
