package com.example.demo6.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.beans.Transient;

@Entity
@Table(name = "role")
public class Role implements  GrantedAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roleEntity;

    @Override
    public String getAuthority() {
        return getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(Role roleEntity) {
        this.roleEntity = roleEntity;
    }
}