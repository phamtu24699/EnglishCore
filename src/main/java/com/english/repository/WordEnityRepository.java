package com.english.repository;

import com.english.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WordEnityRepository extends JpaRepository<WordEntity, UUID> {
}
