package me.herbix.aspectjtest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JustAnotherAspect {


    @Pointcut("execution(* *..*(..)) && @annotation(logAnno) && !within(me.herbix.aspectjtest.aspect.JustAnotherAspect)")
    private void godLogPointcut(GodLog logAnno) {}

    @Before("godLogPointcut(logAnno)")
    public void beforeGodLogMethod(GodLog logAnno, JoinPoint joinPoint) {
        System.out.println("I call " + joinPoint.getSignature() + "! Message: " + logAnno.value());
    }

}