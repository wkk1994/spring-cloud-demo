package com.wkk.controller;

import com.wkk.dao.UserInfoDao;
import com.wkk.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
@RestController
public class UserInfoController {
    @Autowired
    private UserInfoDao userInfoDao;
    @GetMapping(value = "/user/{id}")
    public UserInfo findUserIdById(@PathVariable Long id){
        return userInfoDao.findOne(id);
    }
}
