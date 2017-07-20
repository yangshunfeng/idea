package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qunar.tc.qtracer.QTracer;

class ThreadDemo implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(ThreadDemo.class);

    @Override
    public void run() {
        logger.info("info test 这个地方输出INFO级别的日志");
    }
}

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("trace test 这个地方输出DEBUG级别的日志");
        logger.debug("debug test 这个地方输出DEBUG级别的日志");
        logger.info("info test 这个地方输出INFO级别的日志");
        logger.warn("warn test 这个地方输出ERROR级别的日志");
        logger.error("error test 这个地方输出ERROR级别的日志");
        Thread thread = new Thread(QTracer.wrap(new ThreadDemo()));
        thread.start();
    }
}
