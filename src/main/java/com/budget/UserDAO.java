package com.budget;

import com.budget.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
    @Autowired
    UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public User findByUserId(User user){
       return userRepository.findByUserid(user.getUserid());
    }

}
