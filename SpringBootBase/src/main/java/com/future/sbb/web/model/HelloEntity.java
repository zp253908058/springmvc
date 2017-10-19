package com.future.sbb.web.model;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see HelloEntity
 * @since 2017/10/16
 */
public class HelloEntity {

    private String name;

    public HelloEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
