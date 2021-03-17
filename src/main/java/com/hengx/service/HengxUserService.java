package com.hengx.service;

import com.hengx.model.HengxUser;
import com.hengx.util.Page;

import java.util.List;

/**
 * @Author xcp
 * @date 2020/11/22 12:07
 */
public interface HengxUserService {
    List<HengxUser> findAll();
    int insert(HengxUser hengxUser);
    int update(HengxUser hengxUser);
    HengxUser findById(Integer id);
    List<HengxUser> findOne(HengxUser hengxUser);

    //分页
    List<HengxUser> list(Page page);
    int total();
    //PageHelper 分页
    List<HengxUser> list1();
}
