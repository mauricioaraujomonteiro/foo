package com.github.mauricioaraujomonteiro.domain.port.api;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;

public interface CustomerManagementPort {

    boolean save(UserDTO userDTO);
}
