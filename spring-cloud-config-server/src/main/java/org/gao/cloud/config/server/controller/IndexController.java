package org.gao.cloud.config.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/13 18:29
 */
@RestController
@Slf4j
public class IndexController {

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/config-server")
    public String index(){
        log.info("==>测试config-server,时间为{}",LocalDateTime.now());
        System.out.println(applicationContext);
        ApplicationContext parent = applicationContext.getParent();
        System.out.println(parent);
        Environment environment = applicationContext.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        return environment.getProperty("gao.user.name");
    }

    @GetMapping("config-server2")
    public String index2(@Value("${gao.user.name}") String name){
        return name;
    }

}
