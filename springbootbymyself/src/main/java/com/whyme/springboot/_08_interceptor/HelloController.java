package com.whyme.springboot._08_interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("这里是controller方法!!!");
        return "此请求地址被拦截器放行!!!";
    }
}
