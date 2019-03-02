package com.whyme.springboot._04mybatis.controller;

import com.whyme.springboot._04mybatis.domain.Permission;
import com.whyme.springboot._04mybatis.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PermissionController {

    @Autowired
    private IPermissionService service;

    @RequestMapping("/list")
    @ResponseBody
    public List<Permission> list(){
        return service.selectAll();
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        Permission permission = new Permission();
        service.savePermission(permission);
        return "保存成功";
    }
}
