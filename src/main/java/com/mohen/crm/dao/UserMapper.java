package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.User;

public interface  UserMapper extends BaseMapper<User,Integer> {

    User  queryUserByUserName(String userName);
}