package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value="push")
public class PushController {

    @RequestMapping(value = "image-words")
    public String imageWords(){
        return "push/image-words";
    }

    @RequestMapping(value = "template")
    public String templateInfo(){
        return "push/template";
    }

    @RequestMapping(value = "custom")
    public String custom(){
        return "push/custom";
    }
}
