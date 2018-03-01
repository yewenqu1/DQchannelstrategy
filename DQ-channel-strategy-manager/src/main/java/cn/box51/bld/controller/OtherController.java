package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value = "other")
public class OtherController {

    @RequestMapping(value = "menu")
    public String menu(){
        return "other/menu";
    }

    @RequestMapping(value = "keywords")
    public String keywords(){
        return "other/keywords";

    }

    @RequestMapping(value = "image-words")
    public String imageWords(){
        return "other/image-words";

    }
}
