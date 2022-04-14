package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient  //标识是一个客户端
@EnableDiscoveryClient
@EnableFeignClients(basePackages="cn.itsource.feignClient")
public class Crm_RunApp {
    public static void main(String[] args) {
        SpringApplication.run(Crm_RunApp.class,args);
    }
}
