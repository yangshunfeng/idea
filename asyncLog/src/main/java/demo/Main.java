package demo;

import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.io.IOException;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, JoranException, InterruptedException {
        logger.trace("这个地方输出DEBUG级别的日志");
        logger.debug("这个地方输出DEBUG级别的日志");
        logger.info("这个地方输出INFO级别的日志");
        logger.warn("这个地方输出WARN级别的日志");
        logger.error("这个地方输出ERROR级别的日志");
        Thread.sleep(1000);// 日志输出线程为后台线程，阻塞等待日志输出
    }
}
