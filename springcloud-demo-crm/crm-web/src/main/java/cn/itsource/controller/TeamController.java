package cn.itsource.controller;

import cn.itsource.feignClient.EmpCllent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TeamController {

    @Autowired
    RestTemplate restTemplate;


    @Autowired
    EmpCllent empCllent;


    @RequestMapping("/getEmp/{id}")
    public String getEmp(@PathVariable("id") Integer id){
       //String url="http://localhost:8001/getEmp/"+id;
        String url="http://springcloud-demo-ehr/getEmp/"+id;
        String forObject = restTemplate.getForObject(url, String.class);
        return  forObject;
    }

    @RequestMapping("/getEmp2/{id}")
    public String getEmpForfeign(@PathVariable("id") Integer id){
        String emp = empCllent.getEmp(id);
        return  emp;
    }

}
