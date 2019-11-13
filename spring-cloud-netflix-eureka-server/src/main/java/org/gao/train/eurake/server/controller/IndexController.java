package org.gao.train.eurake.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/5 16:37
 */
@RestController
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "Hello Spring cloud!";
    }

}
