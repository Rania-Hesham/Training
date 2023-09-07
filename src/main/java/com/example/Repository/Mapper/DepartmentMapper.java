package com.example.Repository.Mapper;

import DTO.DepartmentDto;
import com.example.Repository.Mapper.common.JPAEntityMapper;
import com.example.Repository.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, unmappedTargetPolicy = ReportingPolicy.IGNORE)


public interface DepartmentMapper extends JPAEntityMapper<Department,DepartmentDto> {

//    DepartmentDto map(Department employee);
//    Department unmap (DepartmentDto dto);
}
