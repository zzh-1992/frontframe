package com.grapefruit.frontframe.service.impl;

import com.grapefruit.frontframe.dao.RoleDao;
import com.grapefruit.frontframe.entity.Role;
import com.grapefruit.frontframe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Role queryById(Integer id) {
        return null;
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Role> queryAll() {
        return null;
    }
}
