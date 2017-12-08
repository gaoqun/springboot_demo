package com.haha.health.dao;

import com.haha.health.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by gaige on 2017/12/7.
 */
@Repository
@Mapper
public interface UserMapper {
    User findUserById(Integer id);
}
