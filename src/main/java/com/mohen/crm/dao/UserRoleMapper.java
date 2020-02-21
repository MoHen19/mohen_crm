package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.UserRole;

public interface UserRoleMapper extends BaseMapper<UserRole,Integer> {

    public int countUserRoleByUserId(Integer userId);

    public int deleteUserRoleByUserId(Integer userId);
}