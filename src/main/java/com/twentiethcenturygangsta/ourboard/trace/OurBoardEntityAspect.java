package com.twentiethcenturygangsta.ourboard.trace;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class OurBoardEntityAspect {

    @Before("@annotation(com.twentiethcenturygangsta.ourboard.trace.OurBoardEntity)")
    public String getGroup(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        OurBoardEntity jamBoardEntity = method.getAnnotation(OurBoardEntity.class);
        return jamBoardEntity.group();
    }


}