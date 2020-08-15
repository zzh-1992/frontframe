package com.grapefruit.frontframe.service;

import com.grapefruit.frontframe.entity.Role;

import java.util.List;

/**
 * (TRole)表服务接口
 *
 * @author makejava
 * @since 2020-08-10 13:08:20
 */
public interface RoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Role queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Role> queryAll();



}