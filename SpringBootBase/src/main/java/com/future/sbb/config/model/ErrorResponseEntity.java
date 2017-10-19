package com.future.sbb.config.model;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see ErrorResponseEntity
 * @since 2017/10/16
 */
public class ErrorResponseEntity extends ResponseEntity<String> {

    public static ErrorResponseEntity create(int code, String message) {
        ErrorResponseEntity result = new ErrorResponseEntity();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static ErrorResponseEntity create(int code, Exception e) {
        return create(code, e.getMessage());
    }
}
