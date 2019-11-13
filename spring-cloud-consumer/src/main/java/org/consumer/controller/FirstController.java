package org.consumer.controller;

import org.consumer.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/6 14:57
 */
@RestController
public class FirstController {


    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("discoverClient")
    public String callIndex(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            System.out.println(service + " == > "+instances.size());
            if(instances.size()>0){
                System.out.println(instances.get(0));
            }
        }
        return "done";
    }


    @GetMapping("discoverClient/{serverId}")
    public String call(@PathVariable String serverId){
        System.out.println("==>"+serverId);
        List<ServiceInstance> instances = discoveryClient.getInstances(serverId);
        if(instances == null){
            return "没有找到对应的实例";
        }
        instances.stream().forEach(System.out::println);
        String hosts = instances.stream().map(ServiceInstance::getHost).collect(Collectors.joining(","));
        return "==>"+hosts;
    }

    @Autowired
    RestTemplate restTemplate;


    @GetMapping(value = "/person/{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String person(@PathVariable String name){
        String resp = restTemplate.getForObject("http://producer/call/" + name,String.class);
        return resp;
    }


}
