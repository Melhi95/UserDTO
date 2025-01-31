package ru.vaidom.dto.request;

import lombok.Data;

@Data
public class UserUpdateDto {
    private int age;
    private String email;
    private Long phone;
    private int salary;
}
