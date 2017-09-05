package com.wkk.feign;

import com.wkk.entity.UserInfo;
import feign.Param;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Component
public class UserFallback implements UserFeignClinet{
    @Override
    public UserInfo findById(@Param("id") Long id) {
        System.out.println("=========Fallback");
        UserInfo user = new UserInfo();
        user.setId(0L);
        return user;
    }
}
