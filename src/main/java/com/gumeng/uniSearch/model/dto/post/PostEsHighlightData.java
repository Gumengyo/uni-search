package com.gumeng.uniSearch.model.dto.post;

import lombok.Data;

/**
 * 搜索关键词高亮
 * @author gumeng
 */

@Data
public class PostEsHighlightData {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;
}
