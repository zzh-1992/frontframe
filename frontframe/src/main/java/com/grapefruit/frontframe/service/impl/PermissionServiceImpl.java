package com.grapefruit.frontframe.service.impl;

import com.grapefruit.frontframe.dao.PermissionDao;
import com.grapefruit.frontframe.entity.Permission;
import com.grapefruit.frontframe.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionDao permissionDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Permission queryById(Integer id) {
        return permissionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Permission> queryAll() {
        return permissionDao.queryAll();
    }
}
