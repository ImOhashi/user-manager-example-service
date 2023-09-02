package com.ohashi.usermanagerexampleservice.resources.repository;

import com.ohashi.usermanagerexampleservice.resources.model.UserDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDocument, ObjectId> {
}
