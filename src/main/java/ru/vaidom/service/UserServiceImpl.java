package ru.vaidom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vaidom.dto.request.UserCreateDto;
import ru.vaidom.dto.request.UserUpdateDto;
import ru.vaidom.dto.response.UserGetAllDto;
import ru.vaidom.dto.response.UserGetByIdDto;
import ru.vaidom.mappers.UserMapper;
import ru.vaidom.repository.UserRepository;
import ru.vaidom.model.User;

import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public UserCreateDto saveUser(User user) {
        user.setCreated(Calendar.getInstance());
        return UserMapper.INSTANCE.userToUserCreateDto(userRepository.save(user));
    }

    @Override
    public UserGetByIdDto getUserById(Long id) {
        return UserMapper.INSTANCE.userToUserGetByIdDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public List<UserGetAllDto> getAllUsers() {
        return UserMapper.INSTANCE.userToUserGetAllDto(userRepository.findAll());
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public UserUpdateDto updateUserById(Long id, User user) {
        return UserMapper.INSTANCE.userToUserUpdateDto(userRepository.save(user));
    }
}
