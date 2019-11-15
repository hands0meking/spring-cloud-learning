package org.gao.cloud.config.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/13 16:10
 */
@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApplication.class).run(args);
    }

}
