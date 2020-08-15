package com.grapefruit.frontframe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataVO {

    /**
     * 一维结果集
     */
    List<?> list;

    /**
     * 二维结果集
     */
    Map<String,List<?>> map;

    /**
     * 返回消息
     */
    String message;

    /**
     * 内容栏-头部名称
     */
    String headerName;

    /**
     * 一级菜单名字
     */
    String menuName;

}
