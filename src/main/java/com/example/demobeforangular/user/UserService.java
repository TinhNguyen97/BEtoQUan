package com.example.demobeforangular.user;

import com.example.demobeforangular.model.dto.UserPrincipal;
import com.example.demobeforangular.model.entity.User;
import com.example.demobeforangular.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void removeProductById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       User user= userRepository.findByEmail(email);
       return UserPrincipal.build(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean checkRegexPassword(String email) {
        String regex = "[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[A-Za-z]{2,6}";
        return Pattern.matches(regex, email);
    }

    @Override
    public boolean checkRegexEmail(String email) {
        String regex = "[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[A-Za-z]{2,6}";
        return Pattern.matches(regex, email);
    }
}
