package com.fanlun.springcloud.service;

import com.fanlun.springcloud.Entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value="microservicecloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    boolean add(Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable(value = "id") Long id);

    @GetMapping("/dept/list")
    List<Dept> list();

}
