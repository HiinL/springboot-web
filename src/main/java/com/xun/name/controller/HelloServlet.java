package com.xun.name.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
public class HelloServlet{

    @GetMapping(value = "/hello")
    public String  hello(Model model){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        model.addAttribute("currentTime","当前时间:"+ currentTime);
        return "hello";
    }
}
