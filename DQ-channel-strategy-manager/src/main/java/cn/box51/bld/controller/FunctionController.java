package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value="/function")
public class FunctionController {

    @RequestMapping(value = "/zdhf")
    public String zdhf(){
        return "function/zdhf";
    }

    @RequestMapping(value = "/gg")
    public String gg(){
        return "function/gg";
    }

    @RequestMapping(value = "/menu")
    public String menu(){
        return "function/menu";
    }

    @RequestMapping(value = "/hhy")
    public String hhy(){
        return "function/hhy";
    }
}
