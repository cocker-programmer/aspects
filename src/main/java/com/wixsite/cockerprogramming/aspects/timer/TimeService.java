package com.wixsite.cockerprogramming.aspects.timer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TimeService {

    @Timer
    public void shortMethod() {
        log.info("This is a short method");
    }

    @Timer
    public void mediumMethod() throws InterruptedException {
        log.info("This is method with 1 sec. delay");
        Thread.sleep(1000);
    }

    @Timer
    public void longMethod() throws InterruptedException {
        log.info("This is method with 6 sec. delay");
        Thread.sleep(6000);
    }
}
