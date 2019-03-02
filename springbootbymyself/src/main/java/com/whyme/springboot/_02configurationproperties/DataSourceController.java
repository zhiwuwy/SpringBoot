package com.whyme.springboot._02configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataSourceController {
    @Autowired
    private MyDruidDataSource dataSource;

    @RequestMapping("/datasource")
    @ResponseBody
    public String dataSourcePage(){
        System.out.println("222222");
        System.out.println(dataSource);
        return "mydataSource!";
    }
}
