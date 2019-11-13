package org.gao.train.eurake.client.config;

import com.netflix.appinfo.AmazonInfo;
import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
import com.sun.jersey.api.client.filter.ClientFilter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.MutableDiscoveryClientOptionalArgs;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/5 21:02
 * JSR311
 */
@SpringBootConfiguration
public class ClientConfig {

//    @Bean
    public AbstractDiscoveryClientOptionalArgs discoveryClientOptionalArgs(){
        MyClientFilter myClientFilter = new MyClientFilter();
        MutableDiscoveryClientOptionalArgs args = new MutableDiscoveryClientOptionalArgs();
        Collection<ClientFilter> additionalFilters = args.getAdditionalFilters();
        if(additionalFilters == null){
            additionalFilters = new ArrayList<>();
        }
        additionalFilters.add(myClientFilter);
        args.setAdditionalFilters(additionalFilters);
        return args;
    }

}
