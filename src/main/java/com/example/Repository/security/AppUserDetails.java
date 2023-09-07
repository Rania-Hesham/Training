//package com.example.Repository.security;
//
//import com.example.Repository.entity.AppUser;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//
//public class AppUserDetails implements UserDetails {
//
//    private long id;
//    private String userName;
//    private String password;
//    private List<GrantedAuthority>authorities;
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return userName;
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
//
//    public AppUserDetails(AppUser user) {
//        super();
//        this.id = user.getId();
//        this.userName = user.getName();
//        this.password = user.getPassword();
//
//
//        List<GrantedAuthority>authorities=new ArrayList<>();
//        if (!user.getRoles().isEmpty()){
//            user.getRoles().forEach(role -> {
//                authorities.add(new SimpleGrantedAuthority(role.getName()));
//            });
//        }
//
//
//            }
//}
