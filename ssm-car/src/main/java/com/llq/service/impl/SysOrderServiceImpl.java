package com.llq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.llq.dao.SysOrderMapper;
import com.llq.pojo.SysOrder;
import com.llq.service.SysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOrderServiceImpl implements SysOrderService {

    @Autowired
    private SysOrderMapper sysOrderMapper;


    @Override
    public boolean add(SysOrder sysOrder) {
        int i = sysOrderMapper.insert(sysOrder);
        return  i > 0 ? true : false;
    }

    @Override
    public List<SysOrder> findAllByUid(Integer id) {
        QueryWrapper<SysOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid",id);
        return sysOrderMapper.selectList(queryWrapper);
    }
}
