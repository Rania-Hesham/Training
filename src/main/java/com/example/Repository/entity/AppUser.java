package com.example.Repository.entity;

import com.example.Repository.entity.common.JPAEntity;
import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "sec_users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser extends JPAEntity  {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private long id;
//        private String userName;


        private String password;

       @ManyToMany
       @JoinTable(name = "sec_user_roles" ,
               joinColumns = @JoinColumn(name = "user_id"),
               inverseJoinColumns = @JoinColumn(name = "role_id"))
        private List<Role> roles= new ArrayList<>();

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
}
