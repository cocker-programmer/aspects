package com.wixsite.cockerprogramming.aspects.log;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class LoggingAspect {

    @Before("@annotation(logInputOutput) && args(request)")
    public void logRequest(LogInputOutput logInputOutput, Object request) {
        if (logInputOutput.input()) {
            log.info("Logged input parameters: {}", request);
        }
    }

    @AfterReturning(value = "@annotation(logInputOutput)", returning = "response")
    public void logResponse(LogInputOutput logInputOutput, Object response) {
        if (logInputOutput.output()) {
            log.info("LŁogged output value: {}", response);
        }
    }
}
