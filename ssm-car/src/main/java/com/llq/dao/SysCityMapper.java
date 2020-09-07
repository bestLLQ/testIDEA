package com.llq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.llq.pojo.SysCity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysCityMapper extends BaseMapper<SysCity> {

    List<SysCity> allCitysCar(Integer id);

}