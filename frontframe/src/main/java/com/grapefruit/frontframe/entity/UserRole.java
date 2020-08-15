package com.grapefruit.frontframe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TUserRole)实体类
 *
 * @author makejava
 * @since 2020-08-10 13:08:20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements Serializable {
    private static final long serialVersionUID = -37408063888163270L;
    
    private Integer userId;
    
    private Integer roleId;
    
    private Integer id;

}