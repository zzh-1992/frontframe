package com.grapefruit.frontframe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TRole)实体类
 *
 * @author makejava
 * @since 2020-08-10 13:08:20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private static final long serialVersionUID = 769078619246966390L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 角色名称
    */
    private String name;
    /**
    * 鎺掑簭
    */
    private Integer sort;
    
    private String permissionId;

}