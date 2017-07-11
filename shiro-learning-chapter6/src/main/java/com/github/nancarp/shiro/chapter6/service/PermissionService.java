package com.github.nancarp.shiro.chapter6.service;


import com.github.nancarp.shiro.chapter6.Entity.Permission;

/**
 * Created by NanCarp on 2017/7/11.
 */
public interface PermissionService {
    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);
}
