package org.gao.provicer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/6 14:47
 */
@SpringBootApplication
@EnableEurekaClient
public class ProvicerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProvicerApplication.class).run(args);
    }

}
