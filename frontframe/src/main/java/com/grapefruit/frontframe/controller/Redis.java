package com.grapefruit.frontframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Controller
public class Redis {

    @GetMapping("/pages/redis/transaction")
    public String transaction(){
        return "pages/redis/transaction::link";
    }

    /**
     * redis持久性
     * @return
     */
    @GetMapping("/pages/redis/dataPersistence")
    public String dataPersistence(){
        return "pages/redis/dataPersistence::link";
    }

}
