package com.example.Repository.repository;

import com.example.Repository.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
