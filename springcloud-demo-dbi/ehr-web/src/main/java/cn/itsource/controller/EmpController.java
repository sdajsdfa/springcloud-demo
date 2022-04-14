package cn.itsource.controller;

import cn.itsource.model.Emp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    // restful
    @RequestMapping("/getEmp/{id}")
    public Object  getEmp(@PathVariable("id") Integer id){
        Emp emp=new Emp();
        emp.setId(id);
        emp.setName("kd");
        return emp;
    }

}
