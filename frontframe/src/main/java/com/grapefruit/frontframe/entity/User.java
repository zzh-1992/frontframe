package com.grapefruit.frontframe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-08-10 13:08:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 759490156198992179L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 真实姓名
    */
    private String realname;
    /**
    * 创建时间
    */
    private Date createDate;
    /**
    * 盐（随机数）
    */
    private String salt;
    /**
    * 鐘舵€?,1
    */
    private Integer status;

}