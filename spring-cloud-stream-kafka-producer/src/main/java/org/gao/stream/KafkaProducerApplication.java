package org.gao.stream;

import org.gao.stream.client.ProducerClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.annotation.EnableKafkaStreams;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/11 18:08
 */
@SpringBootApplication
@EnableBinding({Processor.class})
public class KafkaProducerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(KafkaProducerApplication.class).run(args);
    }
}
