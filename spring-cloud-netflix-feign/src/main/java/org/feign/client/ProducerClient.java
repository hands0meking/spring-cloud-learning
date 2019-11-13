package org.feign.client;

import org.feign.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/7 10:00
 */
@FeignClient("producer")
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET,value = "/call/{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Person call(@PathVariable("name") String name);

}
