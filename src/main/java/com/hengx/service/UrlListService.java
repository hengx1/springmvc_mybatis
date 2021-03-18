package com.hengx.service;

import com.hengx.model.HengxUser;
import com.hengx.model.UrlList;
import com.hengx.util.Page;

import java.util.List;

/**
 * @Author xcp
 * @date 2020/11/22 12:07
 */
public interface UrlListService {
    int insert(UrlList urlList);

    List<UrlList> findOne(UrlList urlList);

    //分页
    List<UrlList> list();
    int total();

    void runThread(int id,String url);

}
