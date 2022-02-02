package com.github.mauricioaraujomonteiro.domain.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    @NotNull(message = "Name should not be null")
    @NotEmpty(message = "Name should not be empty")
    public String name;
    @NotNull(message = "Last Name should not be null")
    @NotEmpty(message = "Last Name should not be empty")
    public String lastName;
    @Email(message = "Email should be valid")
    @NotEmpty(message = "Emailshould not be empty")
    @NotNull(message = "Email should not be null")
    public String email;
}
