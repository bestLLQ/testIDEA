package com.llq.service;

import com.llq.pojo.SysCar;

import java.util.List;

public interface SysCarService {

    SysCar findCarById(Integer id);

    List<SysCar> findCarsByCityId(Integer getid);
}
