package com.ohashi.usermanagerexampleservice.domain.service;

import com.ohashi.usermanagerexampleservice.domain.entity.User;
import com.ohashi.usermanagerexampleservice.domain.exception.UserAlreadyExistsException;
import com.ohashi.usermanagerexampleservice.resources.model.UserDocument;

public interface UserService {

    UserDocument createUser(User newUser) throws UserAlreadyExistsException;
}
