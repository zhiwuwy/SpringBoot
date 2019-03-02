package com.whyme.springboot._01hello;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        //3种代码的方式可以启动应用,习惯用第一种
        //启动类的字节码和main方法上的参数
        SpringApplication.run(AppConfig.class, args);
        /*SpringApplication application = new SpringApplication(AppConfig.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);*/
        /*new SpringApplicationBuilder(AppConfig.class).bannerMode(Banner.Mode.OFF).run(args);*/

    }

}
