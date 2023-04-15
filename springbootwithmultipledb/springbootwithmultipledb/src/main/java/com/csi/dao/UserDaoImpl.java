package com.csi.dao;

import com.csi.model.User;
import com.csi.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl {

    @Autowired
    UserRepo userRepoImpl;

    public User saveData(User user){
        return userRepoImpl.save(user);
    }

    public List<User> getAllData(){
        return userRepoImpl.findAll();
    }
}
