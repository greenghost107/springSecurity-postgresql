package com.example.Domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 22/10/2016.
 */
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "user_role")
    private String userRole;

    @OneToMany(mappedBy="role_id")
    private List<UserAccount> userAccountList;

    public UserRole() {
    }

    public UserRole(String userRole) {
        this.userAccountList = new ArrayList<>();
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(List<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }





}
