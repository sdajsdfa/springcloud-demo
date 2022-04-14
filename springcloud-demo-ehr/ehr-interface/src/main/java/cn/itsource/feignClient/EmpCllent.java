package cn.itsource.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-demo-ehr") // 服务名称
public interface EmpCllent {
    @RequestMapping("/getEmp/{id}")
    public  String getEmp(@PathVariable("id") Integer id);
}
