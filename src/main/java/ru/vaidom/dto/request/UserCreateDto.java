package ru.vaidom.dto.request;

import lombok.Data;

@Data
public class UserCreateDto {
    private String name;
    private String surname;
    private int age;
    private String email;
    private Long phone;
    private int salary;
}
