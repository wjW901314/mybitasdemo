package com.wdkj.mybitasdemo.service.impl;

import com.wdkj.mybitasdemo.mapper.UserMapper;
import com.wdkj.mybitasdemo.model.Person;
import com.wdkj.mybitasdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public Person selectUser(Integer id) {
        return userMapper.selectUser(id);
    }

    @Override
    public List<Person> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
