package com.mohen.crm.controller;

import com.mohen.base.BaseController;
import com.mohen.crm.exceptions.ParamsException;
import com.mohen.crm.model.ResultInfo;
import com.mohen.crm.model.UserModel;
import com.mohen.crm.service.UserService;
import com.mohen.crm.utils.LoginUserUtil;
import com.mohen.crm.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author MH19
 */
@Controller
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @GetMapping("user/queryUserByUserId")
    @ResponseBody
    public User queryUserByUserId(Integer userId){
        return userService.selectByPrimaryKey(userId);
    }

    @PostMapping("user/login")
    @ResponseBody
    public ResultInfo login(String userName,String userPwd){
        UserModel userModel = userService.login(userName,userPwd);
        return  success("用户登录成功",userModel);
    }

    @PostMapping("user/updatePassword")
    @ResponseBody
    public ResultInfo updatePassword(HttpServletRequest request,String oldPassword, String newPassword, String confirmPassword){
        userService.updateUserPassword(LoginUserUtil.releaseUserIdFromCookie(request),oldPassword,newPassword,confirmPassword);
        return success("密码更新成功");
    }
}
