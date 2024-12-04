package com.example.springboot.kafka.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int Id;
    private String firstName;
    private String lastName;
}
