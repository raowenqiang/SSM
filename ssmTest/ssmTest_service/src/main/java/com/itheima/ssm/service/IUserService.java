package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll(Integer page,Integer size);

    void save(UserInfo userInfo);

    UserInfo findById(Integer id);

    List<Role> findOtherRoles(Integer id);

    void addRoleToUser(Integer userId, Integer[] roleIds);
}
