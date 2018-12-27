package com.springguru.didemo;

import com.springguru.didemo.controllers.ConstructorInjectedController;
import com.springguru.didemo.controllers.MyController;
import com.springguru.didemo.controllers.PropertyInjectedController;
import com.springguru.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController ctrl = (MyController)ctx.getBean("myController");

        ctrl.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}

