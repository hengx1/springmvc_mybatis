package com.hengx.dao;

import com.hengx.model.DirList;
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
@Repository(value = "DirListDao")
public interface DirListDao {
    @Insert("INSERT INTO dir_list(urlid,dirurl,status) VALUES(#{urlid},#{dirurl}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(DirList dirList);

}
