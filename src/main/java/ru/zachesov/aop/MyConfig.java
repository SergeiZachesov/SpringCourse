package ru.zachesov.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.zachesov.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
