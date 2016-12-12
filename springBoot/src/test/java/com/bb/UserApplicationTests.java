package com.bb;

import com.bb.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2016/12/9.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration( Application.class)
public class UserApplicationTests {

    @Autowired
    private UserService userSerivce;

    @Before
    public void setUp() {
        // 准备，清空user表
        userSerivce.deleteAllUsers();
    }


    @Test
    public void test() throws Exception {

        // 插入5个用户
        userSerivce.create("a", 1);
        userSerivce.create("b", 2);
        userSerivce.create("c", 3);
        userSerivce.create("d", 4);
        userSerivce.create("e", 5);

        Assert.assertEquals( 5, userSerivce.getAllUsers().intValue());

        userSerivce.deleteByName("a");
        userSerivce.deleteByName("b");

        Assert.assertEquals(3, userSerivce.getAllUsers().intValue());
    }


}
