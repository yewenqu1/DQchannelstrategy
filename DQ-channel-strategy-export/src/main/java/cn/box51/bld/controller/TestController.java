package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/2.
 */

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/idx")
    public String index(){

        return "/index";
    }
}
