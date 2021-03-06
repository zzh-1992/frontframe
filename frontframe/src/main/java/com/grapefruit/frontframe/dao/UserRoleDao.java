package com.grapefruit.frontframe.dao;

import com.grapefruit.frontframe.entity.UserRole;

import java.util.List;

/**
 * (TUserRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-10 13:08:20
 */
public interface UserRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRole queryById(Integer id);



    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<UserRole> queryAll();



}