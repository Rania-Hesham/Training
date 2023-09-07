//package com.example.Repository.repository;

//import com.example.Repository.entity.AppUser;
import com.example.Repository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

//public interface UserRepo extends JpaRepository<AppUser,Long> {

//    @Query("select u from AppUser where u.userName = :userName")
//    Optional<AppUser> findByUserName(@Param("userName") String userName);

//    @Query(value = "SELECT u FROM AppUser u WHERE u.userName = :name")
//    List<AppUser> findByName(String name);
//}
