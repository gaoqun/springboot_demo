package com.haha.health.web;

import com.haha.health.service.UserService;
import com.haha.health.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaige on 2017/12/5.
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    UserService service;

    @RequestMapping("userInfo/{userId}")
    public UserVo getUserInfo(@PathVariable("userId")String userId){
        return service.getUserById(userId);
    }

}
