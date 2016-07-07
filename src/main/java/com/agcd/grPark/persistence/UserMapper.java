package com.agcd.grPark.persistence;

import com.agcd.grPark.domain.UserDto;

import java.util.List;

/**
 * Created by user on 2016-07-07.
 */
public interface UserMapper {
    /**
     * select User
     *
     * @param param
     * @return
     */
    List<UserDto> selectUser(UserDto param);

    /**
     *
     * @param param
     * @return
     */
    int insertUser(UserDto param);
}
