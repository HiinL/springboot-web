package com.xun.name.controller;

import com.xun.name.bean.SysUser;
import com.xun.name.service.NameService;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/6/5 13:39
 * @Description:
 * @Version 1.8
 */
@Controller
public class HelloController {

    @Autowired
    NameService nameService;

    @GetMapping(value = "/hello")
    public String hello(Model model) {
        String currentTime = nameService.getTime();
        model.addAttribute("currentTime", "当前时间:" + currentTime);
        return "hello";
    }

    @GetMapping(value = "/hello/{id}")
    public String hello(Model model,@PathVariable("id") Integer id) {
        model.addAttribute("user", nameService.findById(id));
        return "hello_user";
    }
}
