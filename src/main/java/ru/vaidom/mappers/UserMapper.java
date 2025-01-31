package ru.vaidom.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import ru.vaidom.dto.request.UserCreateDto;
import ru.vaidom.dto.request.UserUpdateDto;
import ru.vaidom.dto.response.UserGetAllDto;
import ru.vaidom.dto.response.UserGetByIdDto;
import ru.vaidom.model.User;

import java.util.List;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    List<UserGetAllDto> userToUserGetAllDto(List<User> user);
    UserGetByIdDto userToUserGetByIdDto(User user);
    UserUpdateDto userToUserUpdateDto(User user);
    UserCreateDto userToUserCreateDto(User user);

}
