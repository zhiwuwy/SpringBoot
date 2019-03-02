package com.whyme.springboot._05freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreeMarkerController {

    @RequestMapping("/hello")
    public String hello(Model model){
        int i = 1 / 0;
        model.addAttribute("name","tomcat");
        return "hello";
    }
}
