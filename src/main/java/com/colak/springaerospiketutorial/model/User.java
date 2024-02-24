package com.colak.springaerospiketutorial.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

@Document

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private int age;
}
