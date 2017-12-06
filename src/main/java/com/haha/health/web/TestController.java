package com.haha.health.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gaige on 2017/11/30.
 */
@Controller
public class TestController extends BaseController{


    @RequestMapping("/hello")
    public String test(Model model){
        logger.info("hello world!");
        model.addAttribute("hello","hello world");
        return "index";
    }

}
