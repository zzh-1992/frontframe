package com.grapefruit.frontframe.controller;

import com.grapefruit.frontframe.entity.DataVO;
import com.grapefruit.frontframe.entity.User;
import com.grapefruit.frontframe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2020-08-10 13:26:05
 */
@Controller
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public User selectOne(Integer id) {
        return userService.queryById(id);
    }

    //@RequestMapping("/pages/user/userTable")
    @RequestMapping("/user/list")
    public String queryAll(Model model) {
        List<User> userList = userService.queryAll();

        DataVO data = new DataVO();
        data.setList(userList);
        model.addAttribute("data",data);
        model.addAttribute("userList",userList);
        return "pages/user/userTable::link";
        //
    }


    @RequestMapping("/pages/user/add")
    public String userAdd(Model model) {

        model.addAttribute("data","add==========>");
        return "pages/user/add::link";

    }

    @RequestMapping("/pages/user/delete")
    public String userDelete(Model model,String id) {
        model.addAttribute("data","delete=="+ id+"========>");
        StringBuffer stringBuffer =new StringBuffer();
        return "pages/user/delete::link";

    }

    @RequestMapping("/pages/user/edit")
    public String userEdit(Model model) {
        model.addAttribute("data","edit==========>");
        return "pages/user/edit::link";

    }

}