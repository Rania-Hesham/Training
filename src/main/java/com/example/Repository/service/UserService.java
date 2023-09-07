//package com.example.Repository.service;
//
//import com.example.Repository.entity.AppUser;
//import com.example.Repository.entity.Role;
//import com.example.Repository.repository.UserRepo;
//import com.example.Repository.security.AppUserDetails;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//
////implements UserDetailsService
//@Service
//public class UserService  {
//    @Autowired
//    private UserRepo userRepo;
//
//
//
//    public AppUser findById(Long id) {
//        return userRepo.findById(id).orElse(null);
//    }
//
//    public List<AppUser> findAll()
//    {
//        return userRepo.findAll();
//    }



//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        List<AppUser> appUser =	userRepo.findByName(username);
//
//        if (!appUser.set()) {
//
//            throw new UsernameNotFoundException("This User Not found with selected user name :- " + username);
//        }
//
//        return new AppUserDetails(appUser.get());
//    }






//    public AppUser save(AppUser appUser)
//    {
//        return userRepo.save(appUser);
//    }
//
//    public AppUser update(AppUser appUser)
//    {
//
//        return userRepo.save(appUser);
//
//    }
//
//    public void delete(long id)
//    {
//        userRepo.deleteById(id);
//    }




   // public List<AppUser> getByName(String name){
     //   return userRepo.findByName(name);
   // }
//}
