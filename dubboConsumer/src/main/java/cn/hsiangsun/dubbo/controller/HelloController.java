package cn.hsiangsun.dubbo.controller;

import cn.hsiangsun.dubbo.service.HelloService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private HelloService helloService;

    @GetMapping("/hello")
    public String helloController(String name){
        return helloService.sayHello(name);
    }
}
