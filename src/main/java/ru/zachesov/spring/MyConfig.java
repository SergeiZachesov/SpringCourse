package ru.zachesov.spring;


import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("ru.zachesov.spring")
@PropertySource("classpath:myApplication.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
