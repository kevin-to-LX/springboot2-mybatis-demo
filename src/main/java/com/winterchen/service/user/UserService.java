package com.winterchen.service.user;

import com.github.pagehelper.PageInfo;
import com.winterchen.model.UserDomain;

/**
 * Created by jinyugai on 2018/5/24.
 */
public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
