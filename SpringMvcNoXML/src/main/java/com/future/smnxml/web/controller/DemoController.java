package com.future.smnxml.web.controller;

import com.future.smnxml.web.model.response.DemoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see DemoController
 * @since 2017/9/20
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/test.jsp", produces = "text/plain;charset=UTF-8")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test.json", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public DemoEntity json() {
        return new DemoEntity();
    }
}
