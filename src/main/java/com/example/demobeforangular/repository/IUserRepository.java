package com.example.demobeforangular.repository;

import com.example.demobeforangular.model.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<User,Long> {
    User findByEmail(String email);

}
