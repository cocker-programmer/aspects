package com.wixsite.cockerprogramming.aspects.timer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeServiceTest {

    @Autowired
    private TimeService timeService;

    @Test
    public void shortMethod() {
        timeService.shortMethod();
    }

    @Test
    public void mediumMethod() throws InterruptedException {
        timeService.mediumMethod();
    }

    @Test
    public void longMethod() throws InterruptedException {
        timeService.longMethod();
    }
}