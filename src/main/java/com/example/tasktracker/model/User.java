package com.example.tasktracker.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "app_user")
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String roles;
}
