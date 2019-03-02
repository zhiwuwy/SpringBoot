package com.whyme.springboot._04mybatis.mapper;

import com.whyme.springboot._04mybatis.domain.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {
    List<Permission> selectAll();
    void insert(Permission permission);
}