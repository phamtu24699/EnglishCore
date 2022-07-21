package com.english.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "Account")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String email;

    @Column(name = "PASSWORD")
    private  String password;

    @ManyToMany
    @JoinTable(name = "acount_role" ,joinColumns = @JoinColumn(name = "acount_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<RoleEntity> roleEntities = new ArrayList<>();

}
