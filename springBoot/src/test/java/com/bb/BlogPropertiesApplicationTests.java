package com.bb;

import com.bb.domain.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = Application.class)
public class BlogPropertiesApplicationTests {


    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "程序猿DD");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
    }


}
