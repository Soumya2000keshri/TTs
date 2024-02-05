package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacultyRepository extends MongoRepository<Faculty, String> {

    Faculty findByUsernameAndPassword(String username,String password);
}