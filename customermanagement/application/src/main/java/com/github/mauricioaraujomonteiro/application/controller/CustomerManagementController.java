package com.github.mauricioaraujomonteiro.application.controller;

import com.github.mauricioaraujomonteiro.application.component.CustomerManagementComponent;
import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/customer")
@RequiredArgsConstructor
public class CustomerManagementController {

    private final CustomerManagementComponent customerManagementComponent;

    @PostMapping(path = "/create", consumes = "application/json", produces ="application/json")
    public ResponseEntity<?> create(@RequestBody UserDTO request) {
        customerManagementComponent.save(request);
        return ResponseEntity.ok("criado");
    }
}
