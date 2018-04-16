package com.haha.health.web;

import com.haha.health.domain.Test;
import com.haha.health.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaige on 2017/11/30.
 */
//@RestController
@Controller
//@RequestMapping("/")
public class TestController extends BaseController {

//    Logger logger = LoggerFactory.getLogger(TestController.class);
    Logger logger = LoggerFactory.getLogger("test");

//    @ResponseBody
    @GetMapping("/hello")
    public String test(Map<String,Object> map)
    {
        map.put("test",new Test("haha"));
        map.put("time",System.currentTimeMillis());

        logger.warn("------------------------test----------------------");

        List<Test> tests = new ArrayList<>();
        Test test1 = new Test("gao1");
        Test test2 = new Test("gao2");
        Test test3 = new Test("gao3");
        Test test4 = new Test("gao4");
        Test test5 = new Test("gao5");

        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);
        map.put("tests",tests);
        int i = 2/0;
        return "index";
    }

}
