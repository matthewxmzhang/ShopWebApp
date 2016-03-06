package sample.service;

import sample.mapper.User;
import sample.mapper.UserMapper;

/**
 * Created by matthew2 on 3/5/16.
 */
public class FooServiceImpl implements FooService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User doSomeBusinessStuff(int userId) {
        return this.userMapper.getUser(userId);
    }


}
