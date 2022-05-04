package com.example.demobeforangular.model.dto;

import com.example.demobeforangular.model.entity.Role;
import com.example.demobeforangular.validator.PasswordConfirm;
import com.example.demobeforangular.validator.UniqueEmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpForm {
    private String name;

    @NotEmpty
    @Size(min = 6, max = 30)
    @UniqueEmail
    private String email;

    @PasswordConfirm
    private PasswordForm passwordForm;


    private Set<Role> roles;
}
