package com.mohen.crm.controller;

import com.mohen.base.BaseController;
import com.mohen.crm.exceptions.ParamsException;
import com.mohen.crm.service.UserService;
import com.mohen.crm.utils.LoginUserUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author MH19
 */
@Controller
public class IndexController extends BaseController {


    @Resource
    private UserService userService;

    /**
     * 登录页
     * @return
     */
    @RequestMapping("index")
    public String index(){
        /*if(1==1){
            throw  new ParamsException("参数异常...");
        }*/
        return "index";
    }


    /**
     * 后端管理主页面
     * @return
     */
    @RequestMapping("main")
    public String main(HttpServletRequest request){
        Integer userId = LoginUserUtil.releaseUserIdFromCookie(request);
        request.setAttribute("user",userService.selectByPrimaryKey(userId));;
        return "main";
    }
}