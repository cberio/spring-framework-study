package com.agcd.grPark.service.inf;

import java.util.List;

import com.agcd.grPark.domain.UserDto;

/**
 * Created by user on 2016-07-07.
 */
public interface IUserService {
    /**
     * 유저 리스트 가져오기
     *
     * @param user
     * @return
     */
    public List<UserDto> getUserList(UserDto user);

    public int createUser(UserDto user);
}
