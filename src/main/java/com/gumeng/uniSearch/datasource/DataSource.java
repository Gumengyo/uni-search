package com.gumeng.uniSearch.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author 顾梦
 * @create 2023/6/26
 *
 * 数据源接口（新接入的数据源必须实现）
 */
public interface DataSource<T> {

    /**
     * 搜索
     *
     * @param searchText
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}
