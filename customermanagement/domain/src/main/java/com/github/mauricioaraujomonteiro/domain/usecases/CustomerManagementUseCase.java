package com.github.mauricioaraujomonteiro.domain.usecases;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
import com.github.mauricioaraujomonteiro.domain.port.api.CustomerManagementPort;
import com.github.mauricioaraujomonteiro.domain.port.spi.UserPersistencePort;
import com.github.mauricioaraujomonteiro.domain.services.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerManagementUseCase implements CustomerManagementPort {

    private final UserPersistencePort userPersistencePort;
    private final ValidationService validationService;

    public boolean save(UserDTO userDTO) {

        validationService.validate(userDTO);

        final Optional<UserDTO> save = userPersistencePort.save(userDTO);

        return save.isPresent();
    }
}
