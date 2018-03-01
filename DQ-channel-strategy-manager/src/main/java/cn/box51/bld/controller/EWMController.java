package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value = "ewm")
public class EWMController {

    @RequestMapping(value = "create")
    public String create(){
        return "ewm/create";
    }

    @RequestMapping(value = "stat")
    public String stat(){
        return "ewm/stat";
    }
}
