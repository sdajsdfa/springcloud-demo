package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //标识是一个注册中心服务端
public class EurekaRunApp_2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRunApp_2.class,args);
    }
}
