package com.grapefruit.frontframe.service;

import com.grapefruit.frontframe.entity.Permission;

import java.util.List;

/**
 * (TPermission)表服务接口
 *
 * @author makejava
 * @since 2020-08-10 13:08:20
 */
public interface PermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Permission queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Permission> queryAll();



}