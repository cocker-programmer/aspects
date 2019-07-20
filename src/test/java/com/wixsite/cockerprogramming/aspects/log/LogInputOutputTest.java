package com.wixsite.cockerprogramming.aspects.log;

import com.wixsite.cockerprogramming.aspects.log.LoggingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LogInputOutputTest {

    @Autowired
    private LoggingService loggingService;

    @Test
    public void shouldExecuteAspectOnlyForOutput() {
        loggingService.getMessage(1);
    }

    @Test
    public void shouldExecuteAspectForBoth() {
        loggingService.getMessage(new String[]{"Jack", "Smith"});
    }

    @Test
    public void shouldExecuteAspectOnlyForInput() {
        loggingService.getMessage("Bob");
    }


}
