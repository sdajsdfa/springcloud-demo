package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient  //标识是一个客户端
@EnableDiscoveryClient
public class Crm_RunApp_2 {
    public static void main(String[] args) {
        SpringApplication.run(Crm_RunApp_2.class,args);
    }
}
