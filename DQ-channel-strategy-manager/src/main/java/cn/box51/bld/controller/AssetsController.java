package cn.box51.bld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wq on 2018/2/28.
 */
@Controller
@RequestMapping(value = "assets")
public class AssetsController {

    @RequestMapping(value = "image-words")
    public String imageWords(){
        return "assets/image-words";
    }

    @RequestMapping(value = "image")
    public String image(){
        return "assets/image";
    }

    @RequestMapping(value = "tags")
    public String tags(){
        return "assets/tags";
    }
}
