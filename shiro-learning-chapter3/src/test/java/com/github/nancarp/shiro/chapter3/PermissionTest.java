package com.github.nancarp.shiro.chapter3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NanCarp on 2017/6/23.
 */
public class PermissionTest extends BaseTest {
    @Test
    public void testIsPermitted() {
        login("classpath:shiro-permission.ini", "zhang", "123");
        //判断拥有权限：user:create
        Assert.assertTrue(subject().isPermitted("user:create"));
        //判断拥有权限：user:update and user:delete
        Assert.assertTrue(subject().isPermittedAll("user:update", "user:delete"));
        //判断没有权限：user:view
        Assert.assertFalse(subject().isPermitted("user:view"));
    }
}
