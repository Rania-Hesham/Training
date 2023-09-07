package com.example.Repository.repository;

import com.example.Repository.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {


    @Query(value = "SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findByName(String name);


    @Query(value = "SELECT e FROM Employee e WHERE e.department.id =:deptId ")
    List<Employee> findByDepartmentId(Long deptId);


    @Query(value = "SELECT emp FROM Employee emp WHERE (:name is null or emp.name like :name)")
    Page<Employee> filter (@Param("name")String name, Pageable pageable);



//    @Query(value = "SELECT e FROM Employee e LEFT JOIN FETCH Department WHERE e.department.id =:deptId")
//    List<Employee> findByDepartmentId(Long deptId);

//    @Query(value = "select p from Product p left join fetch ProductCategory ")
//    Page<Product> findAll(Pageable pageable);








//    List<Employee>filter (@Param("empName") String name);
}
