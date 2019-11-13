package org.train.javaEE;

/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/11 18:30
 */
public class KafkaProducerTest {

    public static void main(String[] args) {
        String url = "http://localhost:8082/producer/";
        int begin = 10;
        for (int i = 0; i < 10; i++) {
            HttpPostUtils.get(url+"Gao"+(i+begin));
        }
    }

}
