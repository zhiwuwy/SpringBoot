package com.whyme.springboot._05freemarker;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class HelloControllerAdvice {
    //出现异常就会来到这个方法
    @ExceptionHandler(Exception.class)//告诉它要捕获的异常
    public void handlerError(Exception ex, HandlerMethod handlerMethod){//出现的错误和控制器方法
        System.out.println("统一异常处理");
        System.out.println(ex.getMessage());
        System.out.println(handlerMethod.getBean().getClass());
        System.out.println(handlerMethod.getMethod().getName());
    }
}
