package com.wkk.fegin;

import com.wkk.entity.UserInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Component
public class HystrixClientFallback implements UserFeignClient {
    @Override
    public UserInfo findById(@PathVariable("id") Long id) {
        UserInfo user = new UserInfo();
        user.setId(0L);
        return user;
    }
}
