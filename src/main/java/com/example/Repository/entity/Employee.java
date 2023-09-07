package com.example.Repository.entity;

import com.example.Repository.entity.common.JPAEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Employee Schema")

public class Employee extends JPAEntity {

    @Column(name = "Address")
    private String address;


    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;






// @ManyToOne(fetch = FetchType.LAZY)

//    public Employee() {
//    }
//
//    public Employee (long id, String name){
//        this.id=id;
//        this.name=name;
//    }
//
//    public long getId(){
//        return id;
//    }
//
//    public void setId(long id){
//        this.id=id;
//    }

//    public String getName(){
//        return name;
//
//    }
//
//    public void setName(String name){
//
//        this.name=name;
//    }

//    public String getAddress(){
//        return address;
//    }
//
//    public void setAddress(String address){
//        this.address=address;
//    }
//
//    public void setDepartment(Department department){
//
//        this.department=department;
//    }
//
//    public Department getDepartment(){
//        return department;
//    }
//
//    public String getNational_id(){
//        return national_id;
//    }
//
//    public void setNational_id(String national_id){
//        this.national_id=national_id;
//    }






}
