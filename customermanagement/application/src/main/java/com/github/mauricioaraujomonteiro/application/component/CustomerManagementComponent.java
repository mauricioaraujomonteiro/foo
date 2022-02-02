package com.github.mauricioaraujomonteiro.application.component;

import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
import com.github.mauricioaraujomonteiro.domain.port.api.CustomerManagementPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerManagementComponent {
    private final CustomerManagementPort customerManagementPort;

    public void save(UserDTO user) {
        customerManagementPort.save(user);
    }
}
