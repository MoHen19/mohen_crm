package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.vo.Permission;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission,Integer> {

    public int countPermissionByRoleId(Integer roleId);

    public int deletePermissionsByRoleId(Integer roleId);

    List<Integer>  queryRoleHasAllModuleIdsByRoleId(Integer roleId);

    List<String>  queryUserHasRolesHasPermissions(Integer userId);

    int  countPermissionsByModuleId(Integer mid);

    public  int deletePermissionsByModuleId(Integer mid);
}