package com.xuwei.firstweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: firstweb
 * @author: xuWei
 * @create: 2019/05/03
 * @description: controller层
 */
@RestController
public class WebController {

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

}
