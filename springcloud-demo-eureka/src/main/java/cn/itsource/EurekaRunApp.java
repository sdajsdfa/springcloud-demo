package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //标识是一个注册中心服务端
public class EurekaRunApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRunApp.class,args);
    }
}
