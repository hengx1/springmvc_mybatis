package com.hengx.service.impl;

import com.hengx.dao.UrlListDao;
import com.hengx.model.UrlList;
import com.hengx.service.UrlListService;
import com.hengx.util.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UrlListServiceImpl implements UrlListService {

    @Resource
    private UrlListDao urlListDao;

    @Override
    public int insert(UrlList urlList) {
        return urlListDao.insert(urlList);
    }

    @Override
    public List<UrlList> findOne(UrlList urlList) {
        return urlListDao.findOne(urlList);
    }

    @Override
    public List<UrlList> list(Page page) {
        return urlListDao.list(page);
    }

    @Override
    public int total() {
        return urlListDao.total();
    }
}
