package com.english.repository;

import com.english.entity.RoleEntity;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository  extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByCode(String code);
}
