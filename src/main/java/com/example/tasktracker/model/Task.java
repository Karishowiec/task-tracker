package com.example.tasktracker.model;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Data;
import java.time.LocalDate;


@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
    private String priority;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;
}
