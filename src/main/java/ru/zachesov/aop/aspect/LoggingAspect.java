package ru.zachesov.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.zachesov.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* ru.zachesov.aop.UnyLibrary.*())")
//    private void allGetMethodsUnyLibrary(){
//    }
//
//    @Pointcut("execution(* ru.zachesov.aop.UnyLibrary.returnMagazine())")
//    private void returnBookMethodsUnyLibrary(){}
//
//
//    @Pointcut("allGetMethodsUnyLibrary() && !returnBookMethodsUnyLibrary()")
//    private void allMethodsExceptReturnMagazineUnyLibrary(){}
//
//
//    @Before("allMethodsExceptReturnMagazineUnyLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineUnyLibrary(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineUnyLibrary: writing Log#10");
//    }


//    @Pointcut("execution(* ru.zachesov.aop.UnyLibrary.get*())")
//    private void allGetMethodsUnyLibrary() {
//    }
//
//    @Pointcut ("execution(* ru.zachesov.aop.UnyLibrary.return*())")
//    private void allReturnMethodsUnyLibrary(){}
//
//    @Pointcut ("allGetMethodsUnyLibrary() || allReturnMethodsUnyLibrary()")
//    private void allGetAndReturnMethodsUnyLibrary(){}
//
//    @Before("allGetMethodsUnyLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsUnyLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsUnyLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


   // @Before("ru.zachesov.aop.aspect.MyPointcut.allAddmethods()")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        System.out.println("beforeGetBookAdvice: ?????????????????????? " +
                "?????????????? ???????????????? ??????????/????????????");

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("???????????????????? ?? ??????????: ???????????????? - " + myBook.getAuthor()
                            + " ??????????: " + myBook.getName()
                            + " ?????? ????????????????????: " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("?????????? ?? ???????????????????? ?????????????????? " + obj);
                }
            }
        }
        System.out.println("-------------------------------------");
    }
}
