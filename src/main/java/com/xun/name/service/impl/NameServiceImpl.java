package com.xun.name.service.impl;

import com.xun.name.bean.SysUser;
import com.xun.name.dao.UserDao;
import com.xun.name.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/6/17 16:11
 * @Description:
 * @Version 1.8
 */
@Service
public class NameServiceImpl implements NameService {

    @Autowired
    UserDao userDao;

    @Override
    public String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    @Override
    //@Cacheable(value = "user")
    public SysUser findById(Integer id) {
        System.out.println("查询用户方法执行");
        return userDao.findById(id);
    }
}
