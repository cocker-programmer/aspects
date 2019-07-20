package com.wixsite.cockerprogramming.aspects.timer;

import com.wixsite.cockerprogramming.aspects.log.LogInputOutput;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Configuration
@Slf4j
public class TimerAspect {
    StopWatch stopWatch = new StopWatch();

    @Before("@annotation(timer))")
    public void start(Timer timer) {
        stopWatch.start();
    }

    @After(value = "@annotation(timer)")
    public void stop(Timer timer) {
        stopWatch.stop();
        log.info("Time: "+ stopWatch.getLastTaskTimeMillis() + "ms");
    }

}
