package com.example.Data;

import javax.persistence.*;
import javax.validation.OverridesAttribute;

/**
 * Created by Michael on 16/10/2016.
 */
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String userName;

    private String password;

    public Users()
    {
    }
    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
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
    @Override
    public  String toString()
    {
        return  ("Username " + userName + " Password " + password + " ID " + id);
    }
}
