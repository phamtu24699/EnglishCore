package com.english.Common;

import com.english.entity.RoleEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class SystemCommon {
    public static final String ADMIN = "ROLE_ADMIN";
    public static final String USER = "ROLE_USER";

    public static List<GrantedAuthority> geGrantedAuthorities(List<RoleEntity> roleEntities){
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (RoleEntity entity : roleEntities){
            grantedAuthorities.add(new SimpleGrantedAuthority( entity.getName()));
        }
        return  grantedAuthorities;
    }
}
