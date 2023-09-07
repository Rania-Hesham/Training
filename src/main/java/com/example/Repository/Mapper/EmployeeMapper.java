package com.example.Repository.Mapper;

import DTO.EmployeeDto;
import com.example.Repository.entity.Employee;
import com.example.Repository.service.DepartmentService;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class EmployeeMapper {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private DepartmentService departmentService;



    @Mapping(source = "department", target = "departmentDto")
    public abstract EmployeeDto toDto(Employee employee);


    public abstract List<EmployeeDto> toDto(List<Employee> list);


    @AfterMapping
    public void toDtoAfterMapping(Employee entity, @MappingTarget EmployeeDto dto){
        if (entity.getDepartment() != null) {
            dto.setDepartmentDto(departmentMapper.toDto(entity.getDepartment()));
        }
    }


    @InheritInverseConfiguration
    public abstract Employee toEntity(EmployeeDto employeeDto);

    public abstract List<Employee> toEntity(List<EmployeeDto> list);


    @AfterMapping
    public void toEntityAfterMapping(EmployeeDto dto, @MappingTarget Employee entity) {
        if (dto.getDepartmentDto() != null) {
            entity.setDepartment(departmentService.findById(dto.getDepartmentDto().getId()));
        }

    }
        @InheritInverseConfiguration
        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        public abstract Employee updateEntityFromDto (EmployeeDto dto, @MappingTarget Employee employee);




//    @Mapping(source = "department",target = "departmentDto")
//    EmployeeDto maptoDto(Employee employee);
//
//    @Mapping( target= "department",source = "departmentDto")
//
//   Employee  mapToEntity(EmployeeDto dto);

    }

