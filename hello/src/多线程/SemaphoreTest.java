package 多线程;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by shunfeng.yang on 2017/7/17.
 */
public class SemaphoreTest {
    private static final int COUNT = 40;
    private static Executor executor = Executors.newFixedThreadPool(COUNT);
    private static Semaphore semaphore = new Semaphore(10);
    public static void main(String[] args) {
        for (int i=0; i< COUNT; i++) {
            executor.execute(new Task());
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                //读取文件操作
                System.out.println("读取文件操作");
                semaphore.acquire();
                // 存数据过程
                System.out.println("存数据过程");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            }
        }
    }
}
