package com.example.Repository.service;

import com.example.Repository.entity.Department;
import com.example.Repository.entity.Employee;
import com.example.Repository.repository.DepartmentRepo;
import com.example.Repository.repository.EmployeeRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepo departmentRepo;


    public Department findById(Long id) {
        return departmentRepo.findById(id).orElse(null);
    }

    public List<Department> findAll()
    {
        return departmentRepo.findAll();
    }


    public Department save(Department dept)
    {
        return departmentRepo.save(dept);
    }

    public Department update(Department dept)
    {
        Department current=departmentRepo.findById(dept.getId()).get();
        current.setName(dept.getName());
        return departmentRepo.save(current);

    }

    public void delete(long id)
    {
        departmentRepo.deleteById(id);
    }
}
