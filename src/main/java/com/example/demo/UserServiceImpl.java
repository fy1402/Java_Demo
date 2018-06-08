package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by i-feng on 2018/6/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user");
    }
}
