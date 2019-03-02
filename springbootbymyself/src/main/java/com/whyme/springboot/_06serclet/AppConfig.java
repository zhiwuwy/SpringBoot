package com.whyme.springboot._06serclet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
//@ServletComponentScan
public class AppConfig {

    @Bean
    public ServletListenerRegistrationBean testListener(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(new TestListener());
        return bean;
    }

    @Bean
    public FilterRegistrationBean testFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new TestFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }

    @Bean
    public ServletRegistrationBean testServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new TestServlet());
        bean.addUrlMappings("/testServlet");
        return bean;
    }

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
