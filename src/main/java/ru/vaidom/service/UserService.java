package ru.vaidom.service;

import ru.vaidom.dto.request.UserCreateDto;
import ru.vaidom.dto.request.UserUpdateDto;
import ru.vaidom.dto.response.UserGetAllDto;
import ru.vaidom.dto.response.UserGetByIdDto;
import ru.vaidom.model.User;

import java.util.List;

public interface UserService {
    UserGetByIdDto getUserById(Long id);
    List<UserGetAllDto> getAllUsers();
    UserCreateDto saveUser(User user);
    void deleteUserById(Long id);
    void deleteAll();
    UserUpdateDto updateUserById(Long id, User user);
}
