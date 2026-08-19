package com.edithgu.twitch;


// imports...


import com.edithgu.twitch.db.UserRepository;
import com.edithgu.twitch.db.entity.UserEntity;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;




@Component
public class DevelopmentTester implements ApplicationRunner {


    private final UserRepository userRepository;


    public DevelopmentTester(UserRepository userRepository) {
        this.userRepository = userRepository;
    }




    @Override
    public void run(ApplicationArguments args) {
        UserEntity newUser = new UserEntity(null, "user0", "Foo", "Bar", "password");
        userRepository.save(newUser);
    }
}
