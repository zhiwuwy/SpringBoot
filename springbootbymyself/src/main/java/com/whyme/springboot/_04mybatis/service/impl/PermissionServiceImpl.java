package com.whyme.springboot._04mybatis.service.impl;

import com.whyme.springboot._04mybatis.domain.Permission;
import com.whyme.springboot._04mybatis.mapper.PermissionMapper;
import com.whyme.springboot._04mybatis.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Permission> selectAll() {
        return permissionMapper.selectAll();
    }

    @Override
    public void savePermission(Permission permission) {
        permissionMapper.insert(permission);
        //int a = 1 / 0;
    }
}
