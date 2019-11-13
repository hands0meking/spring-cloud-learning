package org.gao.provicer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/7 10:42
 */
@RestController
@RequestMapping("/url")
public class UrlController {


    @GetMapping
    public String index(HttpServletRequest request){
        return request.getRequestURL().toString();
    }

}
