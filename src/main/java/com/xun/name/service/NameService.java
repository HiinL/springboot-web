package com.xun.name.service;

import com.xun.name.bean.SysUser;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/6/5 14:21
 * @Description:
 * @Version 1.8
 */
public interface NameService {
    String getTime();

    SysUser findById(Integer id);
}
