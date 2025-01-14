package com.sofkau.todo.todoapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Tag")
@Table(name= "tag")
@Data
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    private Long noteId;
}
