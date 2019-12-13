package cn.hsiangsun.dubbo.service.impl;


import cn.hsiangsun.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(
        version = "${dubbo.provider.version}",
        timeout = 1000
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Are you "+name;
    }
}
