package com.sandra.service;

import com.sandra.dto.LoginDto;
import com.sandra.entity.User;
import com.sandra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Boolean existUser(LoginDto login) {
        User user = userRepository.findUserByEmailAndPassword(login.getEmail(),  login.getPassword());

        if (ObjectUtils.isEmpty(user)) {
            return false;
        }
        else {
            return true;
        }

    }


}
