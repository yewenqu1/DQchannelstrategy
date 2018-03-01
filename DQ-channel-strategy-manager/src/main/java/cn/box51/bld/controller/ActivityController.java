package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value = "activity")
public class ActivityController {

    @RequestMapping(value = "manager")
    public String manager(){
        return "/activity/manager";
    }

    @RequestMapping(value = "stat")
    public String stat(){
        return "activity/stat";
    }
}
