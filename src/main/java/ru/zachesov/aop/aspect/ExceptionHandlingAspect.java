package ru.zachesov.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    //@Before("ru.zachesov.aop.aspect.MyPointcut.allAddmethods()")
    public void beforeAddExceptionHandling(){
        System.out.println("beforeGetExceptionHandling: ловим/обрабатываем исключения при попытки получить книгу/журнал");
        System.out.println("-------------------------------------");
    }

}
