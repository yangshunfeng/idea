package jdk8异步方案;

import java.util.Random;

/**
 * Created by shunfeng.yang on 2017/7/21.
 */
public class HelloServiceImpl {
    public String longTask(int a) {
        Random random = new Random();
        try {
            Thread.sleep((random.nextInt(5) + 1) * 100);
            return "hello " + a;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
