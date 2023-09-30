package com.gumeng.uniSearch.controller;

import com.gumeng.uniSearch.manager.SearchFacade;
import com.gumeng.uniSearch.model.vo.SearchVO;
import com.gumeng.uniSearch.common.BaseResponse;
import com.gumeng.uniSearch.common.ResultUtils;
import com.gumeng.uniSearch.model.dto.search.SearchRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子接口
 *
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

   @Resource
   private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {

        return ResultUtils.success(searchFacade.searchAll(searchRequest));

    }


}
