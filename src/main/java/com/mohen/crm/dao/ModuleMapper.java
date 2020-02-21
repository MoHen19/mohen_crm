package com.mohen.crm.dao;

import com.mohen.base.BaseMapper;
import com.mohen.crm.dto.ModuleDto;
import com.mohen.crm.dto.TreeDto;
import com.mohen.crm.vo.Module;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ModuleMapper extends BaseMapper<Module,Integer> {

    public List<TreeDto> queryAllModules();

    Module  queryModuleByGradeAndModuleName(@Param("grade") Integer grade, @Param("moduleName") String moduleName);

    Module  queryModuleByGradeAndUrl(@Param("grade")Integer grade,@Param("url") String url);

    Module  queryModuleByOptValue(String optValue);

    List<Map<String, Object>>  queryAllModulesByGrade(Integer grade);

    int  countSubModuleByParentId(Integer mid);

    public List<ModuleDto> queryUserHasRoleHasModuleDtos(@Param("userId") Integer userId,@Param("grade") Integer grade,@Param("parentId") Integer parentId);
}