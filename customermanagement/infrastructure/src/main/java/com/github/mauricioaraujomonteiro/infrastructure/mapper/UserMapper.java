package com.github.mauricioaraujomonteiro.infrastructure.mapper;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
import com.github.mauricioaraujomonteiro.infrastructure.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

}
