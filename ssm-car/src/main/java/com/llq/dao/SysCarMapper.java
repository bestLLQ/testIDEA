package com.llq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.llq.pojo.SysCar;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysCarMapper extends BaseMapper<SysCar> {


    //
    List<SysCar> findCarsByCityId(Integer id);

}