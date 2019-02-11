package com.springguru.didemo;

import com.springguru.didemo.controllers.MyController;
import com.springguru.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
       // MyController ctrl = (MyController) ctx.getBean("myController");

       /* System.out.println(ctrl.hello() + " ");

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());



    }

}

