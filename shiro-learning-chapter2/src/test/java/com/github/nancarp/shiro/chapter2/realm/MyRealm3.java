package com.github.nancarp.shiro.chapter2.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by NanCarp on 2017/6/23.
 */
public class MyRealm3 implements Realm {
    public String getName() {
        return "myrealm3";
    }

    public boolean supports(AuthenticationToken token) {

        return token instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        if (!"zhang".equals(username)) {
            throw new UnknownAccountException();
        }

        if (!"123".equals(password)) {
            throw new IncorrectCredentialsException();
        }

        return new SimpleAuthenticationInfo(username + "@163.com", password, getName());
    }
}
