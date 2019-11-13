package org.gao.stream.controller;

import org.gao.stream.client.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/11 18:14
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {
//
//    @Autowired
//    ProducerClient producerClient;

    @Autowired
    Processor processor;

    @GetMapping("{msg}")
    public String send(@PathVariable String msg){
        Message message = MessageBuilder.withPayload(msg.getBytes()).build();
        processor.output().send(message);
        return "==>"+msg;
    }

}
