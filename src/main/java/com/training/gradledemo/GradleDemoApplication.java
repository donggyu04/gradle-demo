package com.training.gradledemo;

import com.training.gradledemo.greet.Greeter;
import org.joda.time.LocalTime;


//@SpringBootApplication
public class GradleDemoApplication {
    public static void main(String[] args) {
        LocalTime localTime = new LocalTime();
        System.out.println("The current local time is: " + localTime.toString());

        new Greeter().sayHello();
//        SpringApplication.run(GradleDemoApplication.class, args);
    }
}
