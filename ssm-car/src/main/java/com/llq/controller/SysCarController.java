package com.llq.controller;

import com.llq.pojo.JsonResult;
import com.llq.pojo.SysCar;
import com.llq.pojo.SysCity;
import com.llq.service.SysCarService;
import com.llq.service.SysCityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("car")
@Api("汽车接口")
public class SysCarController {

    @Autowired
    private SysCarService sysCarService;
    @ApiOperation("查找单个汽车信息")
    @RequestMapping("findCar.do")
    public JsonResult findCarById(Integer cid){
        SysCar sysCar = sysCarService.findCarById(cid);
        if (sysCar != null) {
            return new JsonResult(1,"",sysCar);
        } else {
            return new JsonResult(2,"");
        }
    }

    //redu
    @RequestMapping("number.do")
    public JsonResult findNumberByCarId(Integer getid,Integer backid){
        List<SysCar> sysCars = sysCarService.findCarsByCityId(getid);
        sysCars.sort((o1,o2) ->
                Double.compare(o1.getPrice(),o2.getPrice())
        );
        return new JsonResult(1,"",sysCars);
    }

    //zujin
    @RequestMapping("price.do")
    public JsonResult findPriceByCarId(Integer getid){
        List<SysCar> sysCars = sysCarService.findCarsByCityId(getid);
        sysCars.sort((o1,o2) ->
            Double.compare(o1.getPrice(),o2.getPrice())
        );
        return new JsonResult(1,"",sysCars);
    }

}
