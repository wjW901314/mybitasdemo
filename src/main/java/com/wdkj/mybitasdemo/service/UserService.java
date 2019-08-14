package com.wdkj.mybitasdemo.service;


import com.wdkj.mybitasdemo.model.Person;

import java.util.List;

public interface UserService {

    Person selectUser(Integer id);

    List<Person> selectAllUser();
}
