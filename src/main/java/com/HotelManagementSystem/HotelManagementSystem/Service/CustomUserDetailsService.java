package com.HotelManagementSystem.HotelManagementSystem.Service;

import com.HotelManagementSystem.HotelManagementSystem.Entity.User;
import com.HotelManagementSystem.HotelManagementSystem.Repository.UserRepository;
import com.HotelManagementSystem.HotelManagementSystem.ServiceImpl.CustomDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByuserName(userName);
        if(user==null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return new CustomDetailsImpl(user);
    }
}
