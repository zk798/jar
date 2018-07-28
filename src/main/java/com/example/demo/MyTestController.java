package com.example.demo;

import org.springframework.scheduling.concurrent.ScheduledExecutorTask;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyTestController {

    public static List<A> list = new ArrayList<>();

    @RequestMapping("/test/{id}")
    public void A(@PathVariable Integer id){
        if(id%2==0){
            list.add(new A());
            return;
        }
        B b = new B();
        System.out.println(b.hashCode());

    }



}
