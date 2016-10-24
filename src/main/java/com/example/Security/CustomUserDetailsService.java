package com.example.Security;

import com.example.Domain.UserAccount;
import com.example.Domain.UserAccountRepository;
import com.example.Domain.UserRole;
import com.example.Domain.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Michael on 24/10/2016.
 */
/*@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    private final UserAccountRepository userAccountRepository;
    private final UserRolesRepository userRolesRepository;

    @Autowired
    public CustomUserDetailsService(UserAccountRepository userAccountRepository,UserRolesRepository userRolesRepository) {
        this.userAccountRepository = userAccountRepository;
        this.userRolesRepository = userRolesRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountRepository.findByUserName(username).get(0);
        if (userAccount == null)
        {
            throw new UsernameNotFoundException("No user present with username: "+username);
        }
        else
        {
            UserRole userRole = userAccount.getRole_id();
            return new CustomUserDetails(userAccount,userRole);
        }

    }
}*/
