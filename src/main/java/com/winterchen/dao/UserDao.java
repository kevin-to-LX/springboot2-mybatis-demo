package com.winterchen.dao;

import com.winterchen.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * Created by jinyugai on 2018/5/24.
 */
public interface UserDao {
    List<UserDomain> selectUsers();

    int insert(UserDomain user);
}
