package com.mycompany.logistic_management.data.repositories;

import com.mycompany.logistic_management.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User findByUserId(String userid);

}
