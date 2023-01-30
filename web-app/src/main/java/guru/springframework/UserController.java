package guru.springframework;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

public class UserController {

    private final UserMapper userMapper = UserMapper.INSTANCE;

    public User saveUser(UserCommand userCommand){
        //fake impl
        return userMapper.userCommandToUser(new UserCommand());
    }
}