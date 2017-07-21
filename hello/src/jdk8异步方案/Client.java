package jdk8异步方案;

import java.util.List;
import java.util.concurrent.*;

/**
 * Created by shunfeng.yang on 2017/7/21.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        List<String> result = new CopyOnWriteArrayList<String>();
        HelloServiceImpl helloService = new HelloServiceImpl();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->helloService.longTask(2));
        for(int i=0;i<10;i++){
            final int a = i*3;
            CompletableFuture<String> temp = CompletableFuture.supplyAsync(()->helloService.longTask(a));
        }
        System.out.println(future.get(1000, TimeUnit.MILLISECONDS));
    }
}
