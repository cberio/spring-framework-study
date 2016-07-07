package com.agcd.grPark.service;

import com.agcd.grPark.domain.UserDto;
import com.agcd.grPark.persistence.UserMapper;
import com.agcd.grPark.service.inf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 2016-07-07.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 유저 리스트 가져오기
     *
     * @param user
     * @return
     */
    @Override
    public List<UserDto> getUserList(UserDto user) {
        return userMapper.selectUser(user);
    }

    @Override
    public int createUser(UserDto user) {
        return userMapper.insertUser(user);
    }
}
