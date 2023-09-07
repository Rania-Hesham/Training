package com.example.Repository.controller;

import DTO.DepartmentDto;
import DTO.EmployeeDto;
import com.example.Repository.Mapper.EmployeeMapper;
import com.example.Repository.entity.Employee;
import com.example.Repository.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Employee")
@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

//    @GetMapping("/{id}")
//    public Employee getById(@PathVariable long id)
//    {
//        return employeeService.findById(id);
//    }




    @Value("${spring.message}")
    private String message;
    @GetMapping("hello")
    public String hello(){
        return message;
    }


    @GetMapping("/{id}")
    @Operation(summary = "get employee by id")
    public EmployeeDto getById(@PathVariable long id)
    {
        Employee employee=employeeService.findById(id);
        EmployeeDto dto= employeeMapper.toDto(employee);
       return dto;

    }

//    @PostMapping
//    public Employee save(@RequestBody Employee emp)
//    {
//        return employeeService.save(emp);
//    }
//

    @PostMapping
    @Operation(summary = "add new employee")

    public EmployeeDto save(@RequestBody EmployeeDto dto)
    {

//        Employee employee=new Employee(dto.getId(), dto.getName(), dto.getAddress(),dto.getDepartmentDto());
        Employee employee=employeeMapper.toEntity(dto);

        Employee entity=employeeService.save(employee);
        EmployeeDto retrnDto=employeeMapper.toDto(entity);
//        dto.setDepartmentDto(entity.getDepartment());
        return retrnDto;

    }


//    @PutMapping
//    public Employee update(@RequestBody Employee emp)
//    {
//        return employeeService.update(emp);
//
//    }


    @PutMapping
    public EmployeeDto update(@RequestBody EmployeeDto dto)
    {
//        Employee employee=new Employee(dto.getId(), dto.getName(), dto.getAddress(), dto.getDepartmentDto());
        Employee employee=employeeMapper.toEntity(dto);
        Employee entity=employeeService.update(employee);
        EmployeeDto retrnDto=employeeMapper.toDto(entity);
        return retrnDto;
    }


    @GetMapping
    @Operation(summary = "return all employees")

    public List<EmployeeDto> getAll()
    {
      List<EmployeeDto> dto=employeeMapper.toDto(employeeService.findAll());
      return  dto;

    }

@DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        employeeService.delete(id);
    }





//    @GetMapping
//    public List<Employee> getEmpByDeptId(@RequestParam(name = "departmentId", required = false) Long departmentId) {
//        return employeeService.findEmpByDeptId(departmentId);
//    }

//    @GetMapping("/department/{deptId}")
//    public List<Employee> findByDepartmentId(@PathVariable  Long deptId){
//        return employeeService.findByDepartmentId(deptId);
//    }


//    public List<Employee> getEmployees(@RequestParam(name = "departmentId", required = false) Integer departmentId) {
//        if (departmentId != null) {
//            // Filter employees by departmentId if provided
//            return employeesData.stream()
//                    .filter(employee -> employee.getDepartmentId() == departmentId)
//                    .collect(Collectors.toList());
//        } else {
//            // Return all employees if departmentId is not provided
//            return employeesData;
//        }
//    }


   @GetMapping("/name")
    public List<Employee> getEmpByName(@RequestParam (name = "name") String name)
   {
       return employeeService.findByName(name);
   }


    @GetMapping("/filter")
    public Page<Employee> filter(@RequestParam  String name, @RequestParam int pageNumber , @RequestParam int pageSize)
    {
        return employeeService.filter(name,pageNumber,pageSize);
    }







}
