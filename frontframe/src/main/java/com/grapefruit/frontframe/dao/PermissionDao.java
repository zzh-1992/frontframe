package com.grapefruit.frontframe.dao;

import com.grapefruit.frontframe.entity.Permission;

import java.util.List;

/**
 * (TPermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-10 13:08:19
 */
public interface PermissionDao {

    Permission queryById(int id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Permission> queryAll();

}