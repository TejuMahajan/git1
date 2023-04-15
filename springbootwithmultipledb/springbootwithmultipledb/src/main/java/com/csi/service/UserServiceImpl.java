package com.csi.service;

import com.csi.dao.UserDaoImpl;
import com.csi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    UserDaoImpl userDaoImpl;

    public User saveData(User user){
        return userDaoImpl.saveData(user);
    }

    public List<User> getAllData(){
        return userDaoImpl.getAllData();
    }
}
