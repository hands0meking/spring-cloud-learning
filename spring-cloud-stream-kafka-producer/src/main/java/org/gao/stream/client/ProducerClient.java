package org.gao.stream.client;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/11 18:10
 */
public interface ProducerClient {

    @Output("my-top1")
    SubscribableChannel sendMsg();
}
