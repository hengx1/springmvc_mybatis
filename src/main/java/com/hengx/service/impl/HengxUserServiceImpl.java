package com.hengx.service.impl;

import com.hengx.dao.HengxUserDao;
import com.hengx.model.HengxUser;
import com.hengx.service.HengxUserService;
import com.hengx.util.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xcp
 * @date 2020/11/22 12:08
 */
@Service
public class HengxUserServiceImpl implements HengxUserService {

    @Resource
    private HengxUserDao hengxUserDao;

    @Override
    public List<HengxUser> findAll() {
        return hengxUserDao.findAll();
    }

    @Override
    public List<HengxUser> findOne(HengxUser hengxUser) {
        return hengxUserDao.findOne(hengxUser);
    }

    @Override
    public List<HengxUser> list(Page page) {
        return hengxUserDao.list(page);
    }

    @Override
    public int total() {
        return hengxUserDao.total();
    }

    @Override
    public List<HengxUser> list1() {
        return hengxUserDao.list1();
    }

    @Override
    public int insert(HengxUser hengxUser) {
        return hengxUserDao.insert(hengxUser);
    }

    @Override
    public int update(HengxUser hengxUser) {
        return hengxUserDao.update(hengxUser);
    }

    @Override
    public HengxUser findById(Integer id) {
        return hengxUserDao.findById(id);
    }
}
