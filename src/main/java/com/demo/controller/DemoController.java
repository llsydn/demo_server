package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lilinshen
 * @title 请填写标题
 * @description 请填写相关描述
 * @date 2018/11/22 14:52
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
