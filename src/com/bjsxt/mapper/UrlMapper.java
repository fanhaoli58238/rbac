package com.bjsxt.mapper;

import com.bjsxt.pojo.Url;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UrlMapper {
    @Select("select * from url where id in (select uid from role_url where rid = #{0})")
    List<Url> selByRid(int rid);
    /*
    * 查询全部
    *
    * */
    @Select("select * from url")
    List<Url> selAll();
}
