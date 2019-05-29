package com.xuwei.firstweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: firstweb
 * @author: xuWei
 * @create: 2019/05/03
 * @description: controller层
 */
@RestController
public class WebController {

    @Value("${xw.username}")
    private String name;
    @GetMapping("hello")
    public String hello(){
        return "hello,第一个用jenkins构建的web项目";
   }

   @GetMapping("sayHello")
    public String sayHello(){
        return "终于成功构建springBoot项目拉";
    }

    @GetMapping("goodBye")
    public String goodBye(){
        return "结束拉";
    }

    @GetMapping("getName")
    public String getName(){
        return "你好，我是："+name;
    }


}
