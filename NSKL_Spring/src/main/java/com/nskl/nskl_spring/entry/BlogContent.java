package com.nskl.nskl_spring.entry;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 博客
 *
 * @author Honarly
 * @date 2024.06.07
 */
@Data
public class BlogContent {
    private String id;
    private String title; //标题
    private String introduce; //介绍
    private String date;  //时间
    private String content; //内容

    public BlogContent(String title) {
        this.title = title;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-M-d H:m:s"));
    }

    public BlogContent(String title, String introduce, String content) {
        this.title = title;
        this.introduce = introduce;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-M-d H:m:s"));
        this.content = content;
    }
}
