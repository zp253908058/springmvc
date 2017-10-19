package com.future.smnxml.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see HelloController
 * @since 2017/9/20
 */

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
