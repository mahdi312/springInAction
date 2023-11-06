package com.mah312.springinaction.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<UserEntity> getUsers() {
        UserEntity user = new UserEntity();
        user.setAge(21);
        user.setName("Ali");
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(user);
        return userEntities;
    }

    public void saveUsers(List<UserEntity> userEntities) {
        //user save logic
    }
}
