package com.llq.service;

import com.llq.pojo.SysOrder;

import java.util.List;

public interface SysOrderService {
    boolean add(SysOrder sysOrder);

    List<SysOrder> findAllByUid(Integer id);
}
