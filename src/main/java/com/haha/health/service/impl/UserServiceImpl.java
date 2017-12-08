package com.haha.health.service.impl;

import com.haha.health.dao.UserMapper;
import com.haha.health.domain.User;
import com.haha.health.service.UserService;
import com.haha.health.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaige on 2017/12/8.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public UserVo getUserById(String id) {
        User user = userMapper.findUserById(Integer.valueOf(id));
        return new UserVo(user.getId().toString(),user.getUsername(),user.getTelephone(),user.getNickName());
    }
}
