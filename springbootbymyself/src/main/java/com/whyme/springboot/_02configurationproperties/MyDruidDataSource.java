package com.whyme.springboot._02configurationproperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter@Setter@ToString
@Component
@ConfigurationProperties(prefix = "db")
public class MyDruidDataSource {

    private String driverClassName;

    private String url;

    private String username;

    private String password;
}
