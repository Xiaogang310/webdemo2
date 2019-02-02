package com.xiao.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ViewController
 *
 * @author : Gang
 * @date : 2019/2/2
 */
@Controller
@RequestMapping(value = "/")
public class ViewController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
