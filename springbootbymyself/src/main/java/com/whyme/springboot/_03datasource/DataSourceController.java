package com.whyme.springboot._03datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
public class DataSourceController    {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/druidDataSource")
    @ResponseBody
    public String dataSource() throws Exception{
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
        return "DruidDataSource";
    }
}
