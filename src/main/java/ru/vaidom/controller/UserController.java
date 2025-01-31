package ru.vaidom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vaidom.dto.request.UserCreateDto;
import ru.vaidom.dto.request.UserUpdateDto;
import ru.vaidom.dto.response.UserGetAllDto;
import ru.vaidom.dto.response.UserGetByIdDto;
import ru.vaidom.model.User;
import ru.vaidom.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public UserCreateDto saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/user")
    public UserGetByIdDto getUserById(@RequestParam Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<UserGetAllDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/user")
    public void deleteUserById(@RequestParam Long id) {
        userService.deleteUserById(id);
    }

    @DeleteMapping("/user/deleteAll")
    public void deleteAll() {
        userService.deleteAll();
    }

    @PutMapping("/user")
    public UserUpdateDto updateUserById(@RequestBody User user) {
        return userService.updateUserById(user.getId(), user);
    }

}
