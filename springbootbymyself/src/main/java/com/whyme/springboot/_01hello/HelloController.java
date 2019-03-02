package com.whyme.springboot._01hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintStream;

@Controller
public class HelloController {
    @Autowired
    private ApplicationArguments appArgs;

    @RequestMapping
    @ResponseBody
    public String hello(){
        System.out.printf(appArgs.getNonOptionArgs().toString());
        return "hello,springboot!";
    }
}
