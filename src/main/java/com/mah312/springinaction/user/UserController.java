package com.mah312.springinaction.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/getuser")
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users/save")
    public void saveUsers(List<UserEntity> userEntities) {
        userService.saveUsers(userEntities);
    }
}
