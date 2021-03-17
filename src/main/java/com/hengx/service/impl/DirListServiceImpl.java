package com.hengx.service.impl;

import com.hengx.dao.DirListDao;
import com.hengx.model.DirList;
import com.hengx.service.DirListService;
import com.hengx.util.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DirListServiceImpl implements DirListService {
    @Resource
    private DirListDao dirListDao;

    @Override
    public int insert(DirList dirList) {
        return dirListDao.insert(dirList);
    }


}
