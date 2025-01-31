package ru.vaidom.dto.response;

import lombok.Data;
@Data
public class UserGetAllDto {
    private Long id;
    private String name;
    private String surname;
    private int age;
}
