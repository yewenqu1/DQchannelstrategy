package cn.box51.bld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/2.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    Logger a = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/idx")
    public String indedx(){
        a.info("test");
        return "/WEB-INF/index.jsp";
    }
}
