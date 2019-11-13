package org.gao.train.eurake.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/6 14:13
 */
@RestController
@RequestMapping("/discoverClient")
public class DiscoverClientController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping
    public String index() {
        String servers = discoveryClient.getServices().stream().collect(Collectors.joining(","));
        return servers;
    }


    @GetMapping("clientUrl")
    public String ClientUrl(HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        return "url : " + url;
    }
}
