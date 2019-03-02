package com.whyme.springboot._04mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableTransactionManagement 可以不用写springboot帮我们配置好了,在上面的注解里
public class AppConfig {

    /*@Bean
    public PlatformTransactionManager txManager(DataSource dataSource){
        DataSourceTransactionManager txManager = new DataSourceTransactionManager(dataSource);
        return txManager;
    }*/

    public static void main(String[] args) {

        SpringApplication.run(AppConfig.class, args);
    }
}
