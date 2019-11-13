package org.gao.provicer.controller;

import org.gao.provicer.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/6 14:45
 */
@RestController
@RequestMapping("/call")
public class CallController {

    @GetMapping(value = "{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Person call(@PathVariable String name, HttpServletRequest request){
        Person person = new Person(name, "17", request.getRequestURL().toString());
        return person;
    }

}
