package com.haha.health.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaige on 2017/12/5.
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController{

    @RequestMapping("userInfo")
    public void getUserInfo(){

    }

}
