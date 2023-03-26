package com.sandra.dto;


import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto implements Serializable {

    @NotEmpty(message = "Email can not be empty")
    @Email
    private String email;

    @NotEmpty(message = "Password can not be empty")
    @Size( max = 250)
    private String password;
}
