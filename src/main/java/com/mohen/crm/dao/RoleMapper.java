package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper extends BaseMapper<Role,Integer> {

    public List<Map<String,Object>> queryAllRoles();

    public Role queryRoleByRoleName(String roleName);
}