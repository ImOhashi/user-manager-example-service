package com.ohashi.usermanagerexampleservice.domain.service.impl;

import com.ohashi.usermanagerexampleservice.domain.entity.User;
import com.ohashi.usermanagerexampleservice.domain.exception.UserAlreadyExistsException;
import com.ohashi.usermanagerexampleservice.domain.service.UserService;
import com.ohashi.usermanagerexampleservice.resources.model.UserDocument;
import com.ohashi.usermanagerexampleservice.resources.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDocument createUser(User newUser) throws UserAlreadyExistsException {
        if (userRepository.getUserByEmail(newUser.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("User with email=" + newUser.getEmail() + " already exists");
        }

        var userDocument = new UserDocument.Builder()
                .setName(newUser.getName())
                .setSurname(newUser.getSurname())
                .setEmail(newUser.getEmail())
                .setDescription(newUser.getDescription())
                .setType(newUser.getType())
                .setAddress(newUser.getAddress())
                .build();

        return userRepository.save(userDocument);
    }
}
