package com.llq.controller;

import com.llq.pojo.JsonResult;
import com.llq.pojo.SysCity;
import com.llq.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("city")
public class SysCityController {

    @Autowired
    private SysCityService sysCityService;

    @RequestMapping("select.do")
    public JsonResult<List> findById(Integer pid){
        List<SysCity> sysCitys = sysCityService.findCityById(pid);
        return new JsonResult<List>(1,"",sysCitys);
    }

    @RequestMapping("citys.do")
    public JsonResult findAllCityById(Integer getid,Integer backid){
        List<SysCity> listCity =  sysCityService.findAllCitysCars(getid);
        List<SysCity> listCity2 =  sysCityService.findAllCitysCars(backid);
        HashMap<String, Object> map = new HashMap<>();
        map.put("getCity",listCity);
        map.put("backCity",listCity2);
        return new JsonResult(1,"",map);
    }

    @RequestMapping("allCar.do")
    @ResponseBody
    public JsonResult findAllCar(Integer getid,Integer backid){
       List<SysCity> listCity =  sysCityService.findAllCitysCars(getid);
       List<SysCity> listCity2 =  sysCityService.findAllCitysCars(backid);
        HashMap<String, Object> map = new HashMap<>();
        map.put("getCity",listCity);
        map.put("backCity",listCity2);
        return new JsonResult(1,"",map);
    }

}
