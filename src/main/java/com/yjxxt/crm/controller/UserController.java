package com.yjxxt.crm.controller;

import com.yjxxt.crm.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController extends BaseController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }
    @RequestMapping("main")
    public String main(){
        return "main";
    }

}
