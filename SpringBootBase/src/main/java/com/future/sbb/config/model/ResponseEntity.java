package com.future.sbb.config.model;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see ResponseEntity
 * @since 2017/10/16
 */
public class ResponseEntity<T> {

    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
