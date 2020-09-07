package com.llq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.llq.dao.SysCityMapper;
import com.llq.pojo.SysCity;
import com.llq.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysCityServiceImpl implements SysCityService {

    @Autowired
    private SysCityMapper sysCityMapper;

    @Override
    public List<SysCity> findCityById(Integer id) {
        QueryWrapper<SysCity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pid",id);
        return sysCityMapper.selectList(queryWrapper);
    }


    @Override
    public List<SysCity> findAllCitysCars(Integer getid) {
        return sysCityMapper.allCitysCar(getid);
    }

}
