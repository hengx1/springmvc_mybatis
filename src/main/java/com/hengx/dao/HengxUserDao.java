package com.hengx.dao;

import com.hengx.model.HengxUser;
import com.hengx.util.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author xcp
 * @date 2020/11/22 12:06
 */
@Repository(value = "hengxUserDao")
public interface HengxUserDao {
    List<HengxUser> findAll();
    HengxUser findById(Integer id);
    @Update("UPDATE  hengx_user SET name = #{name},age = #{age}, password = #{password} WHERE id = #{id}")
    int update(HengxUser ayUser);

    @Insert("INSERT INTO hengx_user(age,name,password) VALUES(#{age},#{name}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(HengxUser ayUser);

    List<HengxUser> findOne(HengxUser hengxUser);

//    分页
    public List<HengxUser> list(Page page);
    public int total();
    //PageHelper 分页
    public List<HengxUser> list1();
}
