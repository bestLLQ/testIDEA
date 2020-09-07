package com.llq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.llq.dao.SysCarMapper;
import com.llq.pojo.SysCar;
import com.llq.service.SysCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysCarServiceImpl implements SysCarService {

    @Autowired
    private SysCarMapper sysCarMapper;

    @Override
    public SysCar findCarById(Integer id) {
        SysCar sysCar = sysCarMapper.selectById(id);
        return sysCar != null ? sysCar : null;
    }

    @Override
    public List<SysCar> findCarsByCityId(Integer getid) {
//        QueryWrapper<SysCar> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("cid",getid);
//        return sysCarMapper.selectList(queryWrapper);
            return sysCarMapper.findCarsByCityId(getid);
    }
}
