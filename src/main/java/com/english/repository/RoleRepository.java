package com.english.repository;

import com.english.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository  extends JpaRepository<RoleEntity, UUID> {
    RoleEntity findByCode(String code);
}
