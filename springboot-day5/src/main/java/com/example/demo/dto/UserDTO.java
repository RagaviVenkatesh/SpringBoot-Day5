package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email(message = "Email should be valid")
    private String email;
}
