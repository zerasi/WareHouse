package com.dev.warehouse.sys.service.impl;

import com.dev.warehouse.sys.service.RoleUserService;
import com.dev.warehouse.sys.base.result.Results;
import com.dev.warehouse.sys.dao.RoleUserDao;
import com.dev.warehouse.sys.model.SysRoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserDao roleUserDao;

    @Override
    public Results getSysRoleUserByUserId(Integer userId) {
        SysRoleUser sysRoleUser = roleUserDao.getSysRoleUserByUserId(userId);
        if(sysRoleUser != null){
            return Results.success(sysRoleUser);
        }else{
            return Results.success();
        }
    }
}
