package me.herbix.aspectjtest.aspect;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GodLog {
    String value() default "Default Message";
}