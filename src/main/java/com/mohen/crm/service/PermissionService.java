package com.mohen.crm.service;

import com.mohen.base.BaseService;
import com.mohen.crm.dao.PermissionMapper;
import com.mohen.crm.vo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MH19
 */
@Service
public class PermissionService extends BaseService<Permission,Integer> {

    @Autowired
    private PermissionMapper permissionMapper;

    public List<String> queryUserHasRolesHasPermission(Integer userId){
        return permissionMapper.queryUserHasRolesHasPermissions(userId);
    }
}
