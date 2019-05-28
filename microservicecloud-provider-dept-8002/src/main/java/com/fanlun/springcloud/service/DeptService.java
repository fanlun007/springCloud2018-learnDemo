package com.fanlun.springcloud.service;

import com.fanlun.springcloud.Entity.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

}
