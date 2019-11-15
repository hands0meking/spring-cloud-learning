package org.gao.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/14 17:29
 */
@RestController
@RequestMapping("/config-client")
public class IndexController {

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping
    public String index(){
        String name = applicationContext.getEnvironment().getProperty("gao.user.name");
        String age = applicationContext.getEnvironment().getProperty("gao.user.age");
        String sex = applicationContext.getEnvironment().getProperty("gao.user.sex");
        return String.format("姓名：%s , 年龄: %s ,性别:%s",name,age,sex);
    }
}
