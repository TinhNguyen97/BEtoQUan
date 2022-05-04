package com.example.demobeforangular.user;

import com.example.demobeforangular.model.entity.User;
import com.example.demobeforangular.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByEmail(String email);

    boolean checkRegexPassword(String email);

    boolean checkRegexEmail(String email);
}
