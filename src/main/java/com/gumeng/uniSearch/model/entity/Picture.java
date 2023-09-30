package com.gumeng.uniSearch.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 顾梦
 * @create 2023/6/24
 *
 * 图片
 */
@Data
public class Picture implements Serializable {

    private String title;

    private String url;

    private static final long serialVersionUID = 1L;

}

