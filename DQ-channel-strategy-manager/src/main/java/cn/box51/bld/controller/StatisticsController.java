package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value = "statistics")
public class StatisticsController {

    @RequestMapping(value = "order")
    public String order(){
        return "/statistics/order";
    }

    @RequestMapping(value = "push")
    public String push(){
        return "/statistics/push";
    }

    @RequestMapping(value = "button-click")
    public String buttonClick(){
        return "/statistics/button-click";
    }

    @RequestMapping(value = "user-visit")
    public String userVisit(){
        return "/statistics/user-visit";
    }
    @RequestMapping(value = "page-visit")
    public String pageVisit(){
        return "/statistics/page-visit";
    }
    @RequestMapping(value = "follow")
    public String follow(){
        return "/statistics/follow";
    }
}
