package com.example.Security;

import com.example.Domain.UserAccount;
import com.example.Domain.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by Michael on 24/10/2016.
 */
/* public class CustomUserDetails extends UserAccount implements UserDetails {


    public CustomUserDetails(UserAccount userAccount, UserRole userRole) {
        super(userAccount,userRole);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
        /*
          String roles=StringUtils.collectionToCommaDelimitedString(userRoles);
  return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
         */
    /*}

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
        */
