package com.llq.controller;

import com.llq.pojo.JsonResult;
import com.llq.pojo.SysUser;
import com.llq.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("denglu.do")
    public JsonResult login(SysUser sysUser, HttpServletRequest request){
        SysUser user = sysUserService.login(sysUser);
        HttpSession session = request.getSession();
        session.setAttribute("user",sysUser);
        if (user != null) {
            return new JsonResult<SysUser>(1,"登录成功",user);
        } else {
            return new JsonResult<SysUser>(2,"登录失败");
        }
    }


    @RequestMapping("update.do")
    public JsonResult updateInfo(SysUser sysUser){
        boolean b = sysUserService.updateInfo(sysUser);
        if (b) {
            return new JsonResult(1,"修改成功！");
        } else {
            return new JsonResult(2,"修改失败！");
        }
    }

    @RequestMapping("register.do")
    public JsonResult register(SysUser sysUser){
        boolean b = sysUserService.register(sysUser);
        if (b) {
            return new JsonResult(1,"注册成功！");
        } else {
            return new JsonResult(2,"注册失败！");
        }
    }

    @RequestMapping("getUser.do")
    public JsonResult getUser(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        SysUser sysUser = (SysUser) session.getAttribute("user");
        if (sysUser != null) {
            return new JsonResult<SysUser>(200,"",sysUser);
        } else {
            return new JsonResult<SysUser>(400,"",null);
        }
    }

    @RequestMapping("logout.do")
    public void logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        session.invalidate();
    }
}
