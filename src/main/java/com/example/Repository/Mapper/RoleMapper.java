package com.example.Repository.Mapper;

import DTO.RoleDto;
import com.example.Repository.Mapper.common.JPAEntityMapper;
import com.example.Repository.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface RoleMapper extends JPAEntityMapper<Role, RoleDto> {
}
