package DTO;

import DTO.common.GenericDto;
import com.example.Repository.entity.Department;
import lombok.*;

import javax.persistence.*;


@Data
public class EmployeeDto extends GenericDto {

        private String address;

        private DepartmentDto departmentDto;

}
