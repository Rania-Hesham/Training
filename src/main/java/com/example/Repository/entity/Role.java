package com.example.Repository.entity;

import com.example.Repository.entity.common.JPAEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sec_roles")
@Data

public class Role extends JPAEntity {
}
