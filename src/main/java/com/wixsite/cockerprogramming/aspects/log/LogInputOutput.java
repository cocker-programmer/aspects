package com.wixsite.cockerprogramming.aspects.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogInputOutput {

    boolean input() default true;

    boolean output() default true;
}
