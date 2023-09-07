//package com.example.Repository.repository;
//
//import com.example.Repository.entity.AppUser;
//import com.example.Repository.entity.Employee;
//import com.example.Repository.entity.Role;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface RoleRepo extends JpaRepository<Role,Long> {
//    @Query("select r from Role where r.name = :roleName")
//    Optional<Role> findByRoleName(@Param("name") String roleName);

    //@Query(value = "SELECT r FROM Role r WHERE r.name = :name")
    //List<Role> findByName(String name);
//}
