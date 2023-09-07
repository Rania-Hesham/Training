//package com.example.Repository.controller;
//
//import DTO.DepartmentDto;
//import DTO.EmployeeDto;
//import DTO.RoleDto;
//import DTO.UserDto;
//import com.example.Repository.Mapper.UserMapper;
//import com.example.Repository.entity.AppUser;
//import com.example.Repository.entity.Employee;
//import com.example.Repository.entity.Role;
//import com.example.Repository.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @GetMapping
//    public List<UserDto> getAll()
//    {
//        List<UserDto> dto=userMapper.toDto(userService.findAll());
//        return  dto;
//    }
//    @GetMapping("/{id}")
//    public UserDto getById(@PathVariable long id)
//    {
//        AppUser user= userService.findById(id);
//        UserDto dto= userMapper.toDto(user);
//        return dto;
//    }
//





//    @PostMapping
//        public AppUser save(@RequestBody AppUser user)
//        {
//            return userService.save(user);
//        }
//
//    @PutMapping
//    public AppUser update(@RequestBody AppUser appUser)
//    {
//        return userService.update(appUser);
//    }





//    @GetMapping
//    public List<AppUser> getAll()
//    {
//
//        return  userService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public AppUser getById(@PathVariable long id){
//        return userService.findById(id);
//    }


//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable long id)
//    {
//        userService.delete(id);
//    }

   // @GetMapping("/name")
    //public List<AppUser> getByUserName(@RequestParam (name = "name") String name){
       // return userService.getByName(name);
    //}


//}
