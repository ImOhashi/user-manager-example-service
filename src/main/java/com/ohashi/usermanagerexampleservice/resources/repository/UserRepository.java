package com.ohashi.usermanagerexampleservice.resources.repository;

import com.ohashi.usermanagerexampleservice.resources.model.UserDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, ObjectId> {
}
