package com.github.mauricioaraujomonteiro.domain.services;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
import com.github.mauricioaraujomonteiro.domain.exception.BusinessLogicException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Service
@Slf4j
public class ValidationService {

    private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private Validator validator = factory.getValidator();

    public void validate(UserDTO userDTO) {
        final Set<ConstraintViolation<UserDTO>> violations = validator.validate(userDTO);
        for (ConstraintViolation<UserDTO> violation : violations) {
            log.error(violation.getMessage());
        }
        if (!violations.isEmpty()) throw new BusinessLogicException();


    }
}
