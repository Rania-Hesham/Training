//package com.example.Repository.controller;
//
//import DTO.DepartmentDto;
//import DTO.RoleDto;
//import com.example.Repository.Mapper.RoleMapper;
////import com.example.Repository.entity.AppUser;
//import com.example.Repository.entity.Department;
//import com.example.Repository.entity.Employee;
//import com.example.Repository.entity.Role;
//import com.example.Repository.service.RoleService;
//import com.example.Repository.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/role")
//
//public class RoleController {
//    @Autowired
//    private RoleService roleService;
//    @Autowired
//    private RoleMapper roleMapper;


//    @GetMapping
//    public List<Role> getAll()
//    {
//
//        return  roleService.findAll();
//    }

//    @GetMapping("/{id}")
//    public Role getById(@PathVariable long id){
//        return roleService.findById(id);
//    }



//    @GetMapping
//    public List<RoleDto> getAll()
//    {
//        List<RoleDto> dto=roleMapper.toDto(roleService.findAll());
//        return  dto;
//    }
//    @GetMapping("/{id}")
//    public RoleDto getById(@PathVariable long id)
//    {
//        Role role= roleService.findById(id);
//        RoleDto dto= roleMapper.toDto(role);
//        return dto;
//    }






//    @PostMapping
//    public Role save(@RequestBody Role role)
//    {
//        return roleService.save(role);
//    }
//
//    @PutMapping
//    public Role update(@RequestBody Role role)
//    {
//        return roleService.update(role);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable long id)
//    {
//        roleService.delete(id);
//    }

   // @GetMapping("/name")
    //public List<Role> getByRoleName(@RequestParam (name = "name") String name){
     //   return roleService.getByRoleName(name);
    //}




//}
