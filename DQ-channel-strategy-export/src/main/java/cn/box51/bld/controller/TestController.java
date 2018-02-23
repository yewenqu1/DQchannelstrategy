package cn.box51.bld.controller;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/2.
 */

@Controller
@RequestMapping(value = "/test")
public class TestController {

    Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping(value = "/idx")
    public String index(){
        logger.info("ASDSADSADSA");
        return "/index";
    }
}
