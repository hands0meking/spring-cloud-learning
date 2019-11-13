package org.consumer.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/6 17:02
 */
@SpringBootConfiguration
@ConditionalOnProperty(value = "one",prefix = "my.load.balance")
public class LoadBalanceConfig {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
