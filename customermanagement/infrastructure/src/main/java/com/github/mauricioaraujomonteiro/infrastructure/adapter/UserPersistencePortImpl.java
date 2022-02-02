package com.github.mauricioaraujomonteiro.infrastructure.adapter;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
import com.github.mauricioaraujomonteiro.domain.port.spi.UserPersistencePort;
import com.github.mauricioaraujomonteiro.infrastructure.entity.User;
import com.github.mauricioaraujomonteiro.infrastructure.mapper.UserMapper;
import com.github.mauricioaraujomonteiro.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserPersistencePortImpl implements UserPersistencePort {

    private final UserRepository userRepository;

    @Override
    public Optional<UserDTO> save(UserDTO userDTO) {
        final User user = UserMapper.INSTANCE.userDTOToUser(userDTO);
        final User saved = userRepository.save(user);
        return Optional.of(UserMapper.INSTANCE.userToUserDTO(saved));
    }
}
