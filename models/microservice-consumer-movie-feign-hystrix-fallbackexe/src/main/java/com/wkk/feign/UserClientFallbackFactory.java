package com.wkk.feign;

import com.wkk.entity.UserInfo;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
@Component
public class UserClientFallbackFactory implements FallbackFactory<UserFeignClient>{
    private static final Logger LOGGER = LoggerFactory.getLogger(UserClientFallbackFactory.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        LOGGER.info("fallback; reason was: {}", throwable.getMessage());
        return new UserClientWithFallbackFactory() {
            @Override
            public UserInfo findById( Long id) {
                LOGGER.info("进入fallback方法");
                UserInfo user = new UserInfo();
                user.setId(-1L);
                return user;
            }
        };
    }
}
