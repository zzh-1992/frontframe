package com.grapefruit.frontframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Controller
public class Mysql {

    @GetMapping("/pages/mysql/log")
    public String log(){
        return "pages/mysql/log::link";
    }

    @GetMapping("/pages/mysql/view")
    public String test(){
        return "pages/mysql/view::link";
    }

}
