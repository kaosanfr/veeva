package com.sandra.utils.login;

import com.sandra.dto.LoginDto;
import com.sandra.service.UserService;
import lombok.experimental.UtilityClass;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

@UtilityClass
public class ValidateInput {

    public void checkInputData(@Valid LoginDto dataLogin, BindingResult result, UserService userService) {
        if (!ObjectUtils.isEmpty(dataLogin) &&
                !ObjectUtils.isEmpty(dataLogin.getEmail()) &&
                !ObjectUtils.isEmpty(dataLogin.getPassword()) &&
                !userService.existUser(dataLogin)) {

            result.rejectValue("email", null,
                    "The email address is unknown");
        }

    }
}
