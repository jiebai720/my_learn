package com.bb;


import com.bb.domain.RedisUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class RedisApplicationTests1 {


    @Autowired
    private RedisTemplate<String , RedisUser>   redisTemplate;

    @Test
    public void test() {

        RedisUser redisUser = new RedisUser("aaa" , 20);
        redisTemplate.opsForValue().set( redisUser.getUsername() , redisUser );

        Assert.assertEquals( 20 , redisTemplate.opsForValue().get("a").getAge().longValue() );
    }

}
