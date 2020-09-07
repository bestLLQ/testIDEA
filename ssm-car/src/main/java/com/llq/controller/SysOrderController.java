package com.llq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.llq.pojo.JsonResult;
import com.llq.pojo.SysOrder;
import com.llq.pojo.SysUser;
import com.llq.service.SysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("order")
public class SysOrderController {

    @Autowired
    private SysOrderService sysOrderService;

    @RequestMapping("all.do")
    public JsonResult findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                 @RequestParam(defaultValue = "5") Integer pageSize,HttpServletRequest request){
        PageHelper.startPage(pageNum,pageSize);
        SysUser userInfo = (SysUser) request.getSession(false).getAttribute("user");
        List<SysOrder> sysOrders =  sysOrderService.findAllByUid(userInfo.getId());
        PageInfo<SysOrder> pageInfo = new PageInfo<>(sysOrders);
        return new JsonResult(1,"",pageInfo);
    }

    @RequestMapping("add.do")
    public JsonResult addOrder(SysOrder sysOrder, HttpServletRequest request){
        sysOrder.setStatus("已预订");
        SysUser userInfo = (SysUser) request.getSession(false).getAttribute("user");
        System.out.println(userInfo.toString());
        Integer id = userInfo.getId();
        sysOrder.setUid(id);
        boolean b = sysOrderService.add(sysOrder);
        if (b) {
            return new JsonResult(1,"预定成功");
        } else {
            return new JsonResult(0,"预订失败");
        }
    }
}
