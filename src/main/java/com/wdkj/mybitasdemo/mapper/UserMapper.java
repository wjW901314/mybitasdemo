package com.wdkj.mybitasdemo.mapper;

import com.wdkj.mybitasdemo.model.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("SELECT * FROM person WHERE id = #{id}")
    Person selectUser(Integer id);

    @Select("select * from person order by id")
    List<Person> selectAllUser();
}
