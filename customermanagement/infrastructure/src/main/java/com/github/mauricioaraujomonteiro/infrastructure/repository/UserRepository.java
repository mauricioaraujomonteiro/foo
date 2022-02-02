package com.github.mauricioaraujomonteiro.infrastructure.repository;

import com.github.mauricioaraujomonteiro.infrastructure.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
