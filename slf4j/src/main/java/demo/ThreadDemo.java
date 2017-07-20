package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ThreadDemo implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(ThreadDemo.class);
    private String requestId;

    public ThreadDemo(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public void run() {
        logger.info("info test 另一个线程的日志");
    }
}
