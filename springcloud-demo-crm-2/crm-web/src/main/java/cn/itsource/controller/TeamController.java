package cn.itsource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TeamController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getEmp/{id}")
    public String getEmp(@PathVariable("id") Integer id){
        String url="http://localhost:8001/getEmp/"+id;
        String forObject = restTemplate.getForObject(url, String.class);
        return  forObject;
    }


}
