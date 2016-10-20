package cn.lingban.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by heshichao on 16-9-8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    public String test() {
        redisTemplate.opsForValue().set("key", "value");
        return "heshichao-----------------------------------------------------------------------11--";
    }

}
