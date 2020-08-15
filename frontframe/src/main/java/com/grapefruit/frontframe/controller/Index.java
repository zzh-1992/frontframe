package com.grapefruit.frontframe.controller;

import com.grapefruit.frontframe.entity.DataVO;
import com.grapefruit.frontframe.entity.Permission;
import com.grapefruit.frontframe.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Controller
public class Index {

    /**
     * 权限（服务）
     */
    @Autowired
    private PermissionService permissionService;

    @GetMapping("/")
    public String toIndex(Model model){
        List<Permission> permissionList = permissionService.queryAll();
        DataVO data = new DataVO();
        data.setList(permissionList);
        model.addAttribute("permissionList",permissionList);
        model.addAttribute("data",data);
        return "index";

    }
}
