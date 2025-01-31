package ru.vaidom.dto.response;

import lombok.Data;

import java.util.Calendar;

@Data
public class UserGetByIdDto {
    private String name;
    private String surname;
    private int age;
    private String email;
    private Long phone;
    private int salary;
    private Calendar created;
}
