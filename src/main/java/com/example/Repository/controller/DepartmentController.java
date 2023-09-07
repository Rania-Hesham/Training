package com.example.Repository.controller;

import DTO.DepartmentDto;
import DTO.EmployeeDto;
import com.example.Repository.Mapper.DepartmentMapper;
import com.example.Repository.entity.Department;
import com.example.Repository.entity.Employee;
import com.example.Repository.service.DepartmentService;
import com.example.Repository.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {


        private final DepartmentService departmentService;

        private final EmployeeService employeeService;

        private final DepartmentMapper departmentMapper;


        @GetMapping("/{id}")
        public DepartmentDto getById(@PathVariable long id)
        {
            Department department= departmentService.findById(id);
                DepartmentDto dto= departmentMapper.toDto(department);
                return dto;
        }


//        @PostMapping
//        public Department save(@RequestBody Department dept)
//        {
//            return departmentService.save(dept);
//        }

        @PostMapping
        public DepartmentDto save(@RequestBody DepartmentDto dto)
        {
              Department department= departmentMapper.toEntity(dto);
              Department entity=departmentService.save(department);
              DepartmentDto retrnDto=departmentMapper.toDto(entity);
              return retrnDto;
        }


//        @PutMapping
//        public Department update(@RequestBody Department dept)
//        {
//            return departmentService.update(dept);
//        }

        @PutMapping
        public DepartmentDto update(@RequestBody DepartmentDto dto)
        {
                Department department= departmentMapper.toEntity(dto);
                Department entity=departmentService.update(department);
                DepartmentDto retrnDto=departmentMapper.toDto(entity);
                return retrnDto;
        }



        @GetMapping
        public List<DepartmentDto> getAll()
        {
            List<DepartmentDto> dto=departmentMapper.toDto(departmentService.findAll());
            return  dto;
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable long id)
        {
            departmentService.delete(id);
        }


        @GetMapping("/{id}/employee")
        @Operation(summary = "get all employees in a specific department by department id")

        public List<Employee> getEmpByDeptId(@PathVariable long id)
        {
                return employeeService.findByDepartmentId(id);
        }
}
