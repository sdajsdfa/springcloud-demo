package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient  //标识是一个注册中心服务端
@EnableConfigServer //开启配置服务端
public class ConfigRunApp{

    public static void main(String[] args) {
        SpringApplication.run(ConfigRunApp.class,args);
    }
}
