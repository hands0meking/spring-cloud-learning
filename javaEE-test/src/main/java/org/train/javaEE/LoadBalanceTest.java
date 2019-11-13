package org.train.javaEE;
/**
 * @Description
 * @Author gaoqj
 * @Date 2019/11/6 17:23
 * 测试 Ribbon
 */
public class LoadBalanceTest {

    public static void main(String[] args) throws Exception {

        String url = "http://localhost:9001/consumer/person/gao";
        for (int i = 0; i < 100; i++) {
           HttpPostUtils.get(url);
        }

    }


}
