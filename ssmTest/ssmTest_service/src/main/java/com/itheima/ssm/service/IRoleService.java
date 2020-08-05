package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll(Integer page,Integer size);

    void save(Role role);

    Role findById(Integer id);

    List<Permission> findOtherPermissions(Integer id);

    void addPermissionToRole(Integer roleId, Integer[] permissionIds);
}
