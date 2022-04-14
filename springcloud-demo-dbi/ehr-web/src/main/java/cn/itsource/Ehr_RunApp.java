package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
//@EnableEurekaClient  //标识是一个客户端
@EnableDiscoveryClient
public class Ehr_RunApp {
    public static void main(String[] args) {
        SpringApplication.run(Ehr_RunApp.class,args);
    }
}
