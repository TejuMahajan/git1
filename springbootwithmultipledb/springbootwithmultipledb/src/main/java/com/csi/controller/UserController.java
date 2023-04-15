package com.csi.controller;

import com.csi.model.User;
import com.csi.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<User> saveData(@RequestBody User user){
        log.info("#########Trying to save data for User: "+user.getUserName());
        return ResponseEntity.ok(userServiceImpl.saveData(user));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<User>> getAllData(){
        return ResponseEntity.ok(userServiceImpl.getAllData());
    }
}
