package com.llq.service;

import com.llq.pojo.SysUser;

public interface SysUserService {

    boolean updateInfo(SysUser sysUser);

    SysUser login(SysUser sysUser);

    boolean register(SysUser sysUser);
}
