package sample.service;

import sample.mapper.User;
import sample.mapper.UserMapper;

/**
 * Created by matthew2 on 3/5/16.
 */
public interface FooService {

    public void setUserMapper(UserMapper userMapper) ;

    public User doSomeBusinessStuff(int userId) ;
}
