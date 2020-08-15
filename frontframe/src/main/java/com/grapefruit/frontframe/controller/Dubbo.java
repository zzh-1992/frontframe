package com.grapefruit.frontframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Controller
public class Dubbo {

    @RequestMapping("/pages/dobbo/background")
    public String background(){
        System.out.println("==============bg===================");
        return "pages/dubbo/background::link";
        //return "admin/permissionList::table";
    }

    @RequestMapping("/pages/dobbo/stru")
    public String stru(){
        System.out.println("==============stru===================");
        return "pages/dubbo/stru::link";
    }

}
