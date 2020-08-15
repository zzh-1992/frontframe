package com.grapefruit.frontframe.controller;


import com.grapefruit.frontframe.entity.Permission;
import com.grapefruit.frontframe.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * (TPermission)表控制层
 *
 * @author makejava
 * @since 2020-08-10 13:26:01
 */
@RestController
public class PermissionController {
    /**
     * 服务对象
     */
    @Autowired
    private PermissionService permissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/pp")
    public Permission selectOne(Integer id) {
        return permissionService.queryById(id);
    }


    @GetMapping("/permission")
    public List<Permission> queryAll() {
        return permissionService.queryAll();
    }



}