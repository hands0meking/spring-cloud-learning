package org.gao.stream.client;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/11 18:11
 */
public interface ReceiveClient {

    @Input("my-top1")
    SubscribableChannel receive();

}
