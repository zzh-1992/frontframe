package com.grapefruit.frontframe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (TPermission)实体类
 *
 * @author makejava
 * @since 2020-08-10 13:08:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission implements Serializable {
    private static final long serialVersionUID = -59483165028907907L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 权限名称
    */
    private String name;
    /**
    * 请求地址
    */
    private String url;
    /**
    * 类型，1代表menu，2代表permission
    */
    private Integer type;
    /**
    * 父id,顶层id为0
    */
    private Integer parentId;
    /**
    * 权限表达式
    */
    private String perm;

    /**
     * 子菜单集合
     */
    private List<Permission> child;

    /**
     * 显示状态 （0:隐藏 1:显示）
     */
    private Integer display;

}