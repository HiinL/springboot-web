package com.xun.name.dao;

import com.xun.name.bean.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Uny
 * @Date: 2019/6/17 16:26
 * @Version 1.8
 */
@Mapper
public interface UserDao {

    @Select("SELECT * FROM SYS_USER WHERE USER_ID = #{id}")
    SysUser findById(Integer id);
}
