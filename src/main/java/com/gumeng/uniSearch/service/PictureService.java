package com.gumeng.uniSearch.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gumeng.uniSearch.model.entity.Picture;

/**
 * 图片服务
 *
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);

}
