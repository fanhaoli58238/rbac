package com.bjsxt.mapper;

import com.bjsxt.pojo.Element;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ElementMapper {
    @Select("select * from element where id in (select eid from role_element where rid = #{0})")
    List<Element> selByRid(int id);
}
