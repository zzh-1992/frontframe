package com.grapefruit.frontframe.controller;

import com.grapefruit.frontframe.entity.Role;
import com.grapefruit.frontframe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (TRole)表控制层
 *
 * @author makejava
 * @since 2020-08-10 13:26:05
 */
@RestController
@RequestMapping("tRole")
public class RoleController {
    /**
     * 服务对象
     */
    @Autowired
    private RoleService roleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Role selectOne(Integer id) {
        return roleService.queryById(id);
    }

}