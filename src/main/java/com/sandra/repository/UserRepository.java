package com.sandra.repository;

import com.sandra.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    public User findUserByEmailAndPassword(String email, String password);
}
