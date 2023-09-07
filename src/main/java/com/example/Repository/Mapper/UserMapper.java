package com.example.Repository.Mapper;

import DTO.UserDto;
import com.example.Repository.Mapper.common.JPAEntityMapper;
import com.example.Repository.entity.AppUser;
import com.example.Repository.entity.common.JPAEntity;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface UserMapper extends JPAEntityMapper<AppUser, UserDto> {
}
