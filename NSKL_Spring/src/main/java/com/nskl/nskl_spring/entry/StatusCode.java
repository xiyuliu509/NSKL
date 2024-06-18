package com.nskl.nskl_spring.entry;

/**
 * Result的状态码定义
 *
 * @author Honarly
 * @date 2024.06.07
 */
public class StatusCode {
    public static final Integer OK = 20000; //成功
    public static final Integer ERROR = 20001;  //失败
    public static final Integer LOGINERROR = 20002; //用户名或密码错误
    public static final Integer ACCESSERROR = 20003;    //权限不足
    public static final Integer REMOTEERROR = 20004;    //远程调用失败
    public static final Integer REPERROR = 20005;   //重复操作
}
