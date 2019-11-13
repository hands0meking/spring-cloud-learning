package org.feign.controller;

import org.feign.client.ProducerClient;
import org.feign.client.UrlClient;
import org.feign.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/7 9:59
 */
@RestController
@RequestMapping("/feign")
public class IndexController {


    @Autowired
    ProducerClient producerClient;

    @Autowired
    UrlClient urlClient;

    @GetMapping
    public String index(){
        Person gaoqj = producerClient.call("gaoqj");
        System.out.println(gaoqj);
        return " [person]:"+gaoqj.getMsg();
    }


    @GetMapping("url")
    public String url(){
        return urlClient.index();
    }


}
