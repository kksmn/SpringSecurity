package com.example.demo6.dao.impl;

import com.example.demo6.entity.Role;
import com.example.demo6.repository.UserRepository;
import jdk.javadoc.internal.doclets.toolkit.util.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.demo6.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Service
@ComponentScan("com.example.demo6.dao.impl.*")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(final UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final User userEntity = userRepository.findByEmail(email);
        if (userEntity == null) {
            throw new UsernameNotFoundException(email);
        }
        UserDetails user = org.springframework.security.core.userdetails.User.withUsername(userEntity.getEmail())
                .password(userEntity.getPassword())
                .authorities(getAuthorities(userEntity)).build();

        return user;
    }
    private Collection<GrantedAuthority> getAuthorities(User user){
        String role = user.getRoles();
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.toUpperCase()));
        return authorities;
    }
}
