package com.mohen.crm.controller;

import com.mohen.base.BaseController;
import com.mohen.crm.model.ResultInfo;
import com.mohen.crm.model.UserModel;
import com.mohen.crm.query.UserQuery;
import com.mohen.crm.service.UserService;
import com.mohen.crm.utils.LoginUserUtil;
import com.mohen.crm.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author MH19
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @GetMapping("queryUserByUserId")
    @ResponseBody
    public User queryUserByUserId(Integer userId){
        return userService.selectByPrimaryKey(userId);
    }

    @RequestMapping("login")
    @ResponseBody
    public ResultInfo login(String userName,String userPwd){
        UserModel userModel = userService.login(userName,userPwd);
        return  success("用户登录成功",userModel);
    }

    @RequestMapping("updatePassword")
    @ResponseBody
    public ResultInfo updatePassword(HttpServletRequest request,String oldPassword, String newPassword, String confirmPassword){
        userService.updateUserPassword(LoginUserUtil.releaseUserIdFromCookie(request),oldPassword,newPassword,confirmPassword);
        return success("密码更新成功");
    }

    @RequestMapping("index")
    public String index(){
        return "user";
    }

    @RequestMapping("save")
    @ResponseBody
    public ResultInfo saveUser(User user){
        user.getRoleIds().forEach(roleId->{
            System.out.println(roleId);
        });
        userService.saveUser(user);
      return success("用户记录添加成功!");
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> queryUsersByParams(UserQuery userQuery){
        return userService.queryByParamsForDataGrid(userQuery);
    }

    @RequestMapping("update")
    @ResponseBody
    public ResultInfo updateUser(User user){
        userService.updateUser(user);
        return success("用户记录更新成功!");
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResultInfo deleteUser(@RequestParam(name = "id") Integer userId){
        userService.deleteUser(userId);
        return success("用户记录删除成功!");
    }
}
