package com.example.mysql.repository;
	
import com.example.mysql.model.Users;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface DataRepository extends MongoRepository<Users, String> {
}
