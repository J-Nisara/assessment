package com.kbtg.bootcamp.posttest.user;

import com.kbtg.bootcamp.posttest.user_ticket.UserTicket;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "profile")
public class User {
    @Id
    public String id;
    public String username;
    public String password;
    public String role;

    public User() {
    }

//    public String getId() {
//        return id;
//    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
