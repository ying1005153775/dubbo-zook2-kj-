package com.wzy.dubbo.impl;

import com.wzy.dubbo.api.UserApi;
import org.springframework.stereotype.Service;

@Service("userApi")
public class UserApiImpl implements UserApi{

    public String getName() {
        return "韦宗英";
    }
}
