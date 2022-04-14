package cn.itsource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateCfg {
 /*    <!--Spring模拟HTTP请求类 RestTemplate-->
    <bean id="restTemplate" class="org.springframework.web.client.RestTemplate">
    </bean>
    */
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
