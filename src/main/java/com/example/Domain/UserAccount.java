package com.example.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Michael on 16/10/2016.
 */
@Entity
@Table(name = "user_acounts")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String userName;

    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private UserRole role_id;

    public UserAccount(UserAccount userAccount, UserRole userRole) {
        this.userName = userAccount.getUserName();
        this.password = userAccount.getPassword();
        this.role_id = userRole;
    }

    public UserAccount(String username, String password, UserRole userRole) {
        this.userName = username;
        this.password = password;
        this.role_id = userRole;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole_id() {
        return role_id;
    }

    public void setRole_id(UserRole role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return ("Username " + userName + " Password " + password + " ID " + id);
    }
}
