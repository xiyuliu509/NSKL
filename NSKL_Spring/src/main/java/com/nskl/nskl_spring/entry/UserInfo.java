package com.nskl.nskl_spring.entry;

import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.ToString;

/**
 * 用户信息
 * 更新时请一个个采用set方法
 *
 * @author Honarly
 * @date 2024.06.07
 */
@Data
@ToString
public class UserInfo {
    private Integer id;
    @TableField(condition = "%s&lt;#{%s}")
    private String username;
    private String password;
    // 个人展示信息
    @TableField(value = "name", condition = SqlCondition.LIKE)
    private String nickName; //昵称，默认用户名
    private String features; //爱好
    private String project;  //项目
    private String avatar;   //头像
    // 个人详细信息
    private String school ;     //学校
    private String name;        //姓名
    private String education;   //学历
    private String mail;        //电子邮件地址
    private String phone;       //手机号
    private String address;     //家庭住址

    /**
     * 必填项
     * @param username
     * @param password
     */
    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
        // 注册时，昵称默认为username
        this.nickName = username;
    }

}
