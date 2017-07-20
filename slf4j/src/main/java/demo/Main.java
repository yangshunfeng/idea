package demo;

import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.io.IOException;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(userOnly.Main.class);

    public static void main(String[] args) throws IOException, JoranException {
        MDC.put("traceId", "123");
        logger.trace("trace test 这个地方输出DEBUG级别的日志");
        logger.debug("debug test 这个地方输出DEBUG级别的日志");
        logger.info("info test 这个地方输出INFO级别的日志");
        logger.warn("warn test 这个地方输出ERROR级别的日志");
        logger.error("error test 这个地方输出ERROR级别的日志");
        Thread thread = new Thread(new ThreadDemo("123"));
        thread.start();
        MDC.clear();
    }
}
