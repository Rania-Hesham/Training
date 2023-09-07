package DTO;

import DTO.common.GenericDto;
import com.example.Repository.entity.Role;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto extends GenericDto {

//    private long id;
//    private String name;
    private String password;
    private List<Role> roles=new ArrayList<>();
}
