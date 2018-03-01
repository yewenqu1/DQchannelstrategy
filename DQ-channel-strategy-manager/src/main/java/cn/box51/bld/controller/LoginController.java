package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/27.
 */
@RequestMapping(value = "/login")
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String index() {
        return "/login";
    }

}
