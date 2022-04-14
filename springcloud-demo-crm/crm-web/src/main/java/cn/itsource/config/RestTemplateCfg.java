package cn.itsource.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced// 开启负载均衡
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    // 修改成随机策略
    @Bean
    public IRule random(){
        return  new RandomRule();
    }

}
