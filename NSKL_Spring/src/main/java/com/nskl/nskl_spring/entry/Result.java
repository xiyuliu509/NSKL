package com.nskl.nskl_spring.entry;

import lombok.Data;

/**
 * 统一返回信息的格式
 *
 * @author Honarly
 * @date 2024.06.07
 */
@Data
public class Result {
    private Integer code;// 状态码
    private String message;//状态信息
    private Object data;// 数据

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 失败不返回数据
     * @param code
     * @param message
     */
    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
