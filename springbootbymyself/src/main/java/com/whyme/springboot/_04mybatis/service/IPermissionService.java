package com.whyme.springboot._04mybatis.service;

import com.whyme.springboot._04mybatis.domain.Permission;

import java.util.List;

public interface IPermissionService {
    List<Permission> selectAll();
    void savePermission(Permission permission);
}
