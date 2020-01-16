package com.mohen.base;


import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * @author MH19
 */
public class BaseController {

    /**
     * 子类继承父类的方法
     *  先执行@ModelAttribute 注解标注的方法
     */
    @ModelAttribute
    public void preHandler(HttpServletRequest request){
        request.setAttribute("ctx", request.getContextPath());
    }



}
