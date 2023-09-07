package com.example.Repository.service;

import com.example.Repository.Errors.RecordNotFoundException;
import com.example.Repository.entity.Employee;
import com.example.Repository.repository.EmployeeRepo;
import com.sun.xml.bind.v2.model.core.ID;
import liquibase.pro.packaged.T;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;


//    public Employee findById(Long id) {
//        return employeeRepo.findById(id).orElse(null);
//    }

//    public T findById(ID id) {
//
//        Optional<T> entity = employeeRepo.findById(id);
//        if (entity.isPresent()) {
//            return entity.get();
//        } else {
//                throw new RecordNotFoundException("This record with is not found");
//            }


        public Employee findById(Long id) {

            Optional<Employee> entity = employeeRepo.findById(id);
            if (entity.isPresent()) {
                return entity.get();
            } else {
                throw new RecordNotFoundException("This record is not found with this id :"+id);
            }
        }




            public List<Employee> findAll() {
        return employeeRepo.findAll();
    }


    public Employee save(Employee emp) {
        return employeeRepo.save(emp);
    }

    public Employee update(Employee emp) {
        Employee current = employeeRepo.findById(emp.getId()).get();
        current.setName(emp.getName());
        current.setAddress(emp.getAddress());
//        current.setDepartment(emp.getDepartment());
        return employeeRepo.save(current);

    }

    public void delete(long id) {
        employeeRepo.deleteById(id);
    }


//    public List<Employee> findByDepartmentId(Long deptId) {
//        return employeeRepo.findByDepartmentId(deptId);
//    }


    public List <Employee>findByName(String name){
        return employeeRepo.findByName(name);
    }

    public List<Employee> findByDepartmentId(Long id){
        return employeeRepo.findByDepartmentId(id);
    }



    public Page<Employee> filter (String name , int pageNumber , int pageSize){
            if(name.isEmpty()|| name.isBlank() || name==null){
                name=null;
            }
        Pageable page= PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"name"));
            return employeeRepo.filter(name,page);
    }



    //    public List<Employee> getEmployees(@RequestParam(name = "departmentId", required = false) Long departmentId) {
//        if (departmentId != null) {
//            return employeeRepo.findByDepartmentId(departmentId);
//        } else {
//            return employeeRepo.findAll();
//        }
//    }


//    public List<Employee> findEmpByDeptId(Long departmentId) {
//        if (departmentId != null) {
//            return employeeRepo.findByDepartmentId(departmentId);
//        } else {
//            return employeeRepo.findAll();
//        }
//
//
//    }
}

