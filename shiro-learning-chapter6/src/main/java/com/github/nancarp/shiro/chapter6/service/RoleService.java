package com.github.nancarp.shiro.chapter6.service;

import com.github.nancarp.shiro.chapter6.Entity.Role;

/**
 * Created by NanCarp on 2017/7/11.
 */
public interface RoleService {
    public Role createRole(Role role);
    public void deleteRole(Long roleId);
    //添加角色-权限之间关系
    public void correlationPermissions(Long roleId, Long... permissionIds);
    //移除角色-权限之间关系
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
