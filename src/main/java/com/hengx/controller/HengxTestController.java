package com.hengx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xcp
 * @date 2020/11/22 11:38
 */
@Controller
@RequestMapping("/test")
public class HengxTestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }

}
