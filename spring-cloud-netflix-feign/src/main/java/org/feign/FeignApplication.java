package org.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/7 10:06
 */
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = {

})
@EnableEurekaClient
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }

}
