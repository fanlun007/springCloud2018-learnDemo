package com.fanlun.springcloud.controller;

import com.fanlun.springcloud.Entity.Dept;
import com.fanlun.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeptController_Consumer {

    @Autowired
    public DeptClientService clientService;

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return clientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return clientService.list();
    }

    @PostMapping("/consumer/dept/add")
    public Object add(Dept dept) {
        return clientService.add(dept);
    }

}
