package com.llq.service;

import com.llq.pojo.SysCity;

import java.util.List;

public interface SysCityService {
    List<SysCity> findCityById(Integer id);


    List<SysCity> findAllCitysCars(Integer getid);

}
