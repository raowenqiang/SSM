package com.itheima.ssm.service;

import com.itheima.ssm.domain.SysLog;

import java.util.List;

public interface ISysLogService {
    List<SysLog> findAll(Integer page,Integer size);

    void save(SysLog sysLog) throws Exception;
}
