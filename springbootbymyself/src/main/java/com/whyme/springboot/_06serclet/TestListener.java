package com.whyme.springboot._06serclet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class TestListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet容器销毁....");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet容器启动....");
    }
}
