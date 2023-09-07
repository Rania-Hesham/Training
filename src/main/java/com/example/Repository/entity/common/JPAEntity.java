package com.example.Repository.entity.common;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class JPAEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "Name")
        private String name;
}
