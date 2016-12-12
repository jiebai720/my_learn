package com.bb.domain;

import java.io.Serializable;

/**
 * Created by admin on 2016/12/9.
 */
public class RedisUser implements Serializable {


    private String username;
    private Integer age;
    public RedisUser(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
