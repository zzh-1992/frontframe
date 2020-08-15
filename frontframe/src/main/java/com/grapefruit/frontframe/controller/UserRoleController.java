package com.grapefruit.frontframe.controller;

import com.grapefruit.frontframe.entity.UserRole;
import com.grapefruit.frontframe.service.UserRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TUserRole)表控制层
 *
 * @author makejava
 * @since 2020-08-10 13:26:05
 */
@RestController
@RequestMapping("tUserRole")
public class UserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserRole selectOne(Integer id) {
        return userRoleService.queryById(id);
    }

}