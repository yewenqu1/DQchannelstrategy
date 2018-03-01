package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/27.
 */
@Controller
@RequestMapping(value = "/query")
public class CXController {

    @RequestMapping(value = "/user-info")
    public String index(){
        return "query/user-info";
    }

    @RequestMapping(value = "/user-tags")
    public String tags(){
        return "query/user-tags";
    }

    @RequestMapping(value="/user-order")
    public String order(){
        return "/query/user-order";
    }

    @RequestMapping(value="/user-zw")
    public String zw(){
        return "/query/user-zw";
    }
}
