package com.llq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.llq.dao.SysUserMapper;
import com.llq.pojo.SysUser;
import com.llq.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public boolean updateInfo(SysUser sysUser) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",sysUser.getId());
        int i = sysUserMapper.update(sysUser,queryWrapper);
        return i > 0 ? true : false;
    }

    @Override
    public SysUser login(SysUser sysUser) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tel",sysUser.getTel());
        queryWrapper.eq("password",sysUser.getPassword());
        SysUser user = sysUserMapper.selectOne(queryWrapper);
        return user != null  ? user : null;
    }

    @Override
    public boolean register(SysUser sysUser) {
        int i = sysUserMapper.insert(sysUser);
        return i > 0 ? true : false;
    }
}
