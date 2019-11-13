package org.gao.stream;

import org.gao.stream.client.ReceiveClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/11 18:08
 */
@SpringBootApplication
@EnableBinding({Processor.class})
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(KafkaConsumerApplication.class).run(args);
    }


//    @Autowired
//    ReceiveClient receiveClient;

    @StreamListener(Processor.INPUT)
    public void receive(byte[] msg){
        System.out.println("接受的的数据==>"+new String(msg));
    }

}
