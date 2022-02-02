package com.github.mauricioaraujomonteiro.domain.port.spi;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;

import java.util.Optional;

public interface UserPersistencePort {

    Optional<UserDTO> save(UserDTO userDTO);
}
