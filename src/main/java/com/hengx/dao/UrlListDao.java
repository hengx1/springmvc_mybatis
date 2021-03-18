package com.hengx.dao;

import com.hengx.model.HengxUser;
import com.hengx.model.UrlList;
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
@Repository(value = "UrlListDao")
public interface UrlListDao {


//    @Insert("INSERT INTO url_list(urlname,createdate) VALUES(#{urlname},#{createdate})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(UrlList urlList);

    List<UrlList> findOne(UrlList urlList);

//    分页
    public List<UrlList> list();
    public int total();

}
