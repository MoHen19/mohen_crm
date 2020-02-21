package com.mohen.crm.controller;

import com.mohen.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TreeController extends BaseController {

    @RequestMapping("tree01")
    public String tree01(){
        return "tree01";
    }

    @RequestMapping("tree02")
    public String tree02(){
        return "tree02";
    }
}
