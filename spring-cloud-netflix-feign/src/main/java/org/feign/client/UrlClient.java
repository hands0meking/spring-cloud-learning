package org.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/7 10:45
 */
@FeignClient("producer4")
public interface UrlClient {


    @RequestMapping(value = "/url",method = RequestMethod.GET)
    String index();

}
