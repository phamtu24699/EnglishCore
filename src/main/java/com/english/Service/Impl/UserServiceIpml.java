package com.english.Service.Impl;

import com.english.Common.SystemCommon;
import com.english.Service.UserService;
import com.english.entity.UserEntity;
import com.english.repository.RoleRepository;
import com.english.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
@Service
public class UserServiceIpml implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserEntity save(UserEntity userEntity) {
        userEntity.setRoleEntities(Arrays.asList(roleRepository.findByCode(SystemCommon.USER)));
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity update(UserEntity userEntity) {
        return null;
    }

    @Override
    public boolean delete(UUID[] t) {
        return false;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }
}
