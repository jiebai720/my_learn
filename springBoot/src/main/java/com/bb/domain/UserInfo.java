package com.bb.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2016/12/8.
 */
public class UserInfo {

    @NotNull
    @Size(min=2, max=30)
    private String userName ;


    @NotNull
    @Min(18)
    private String age ;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {

//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserInfo userInfo = (UserInfo) o;
//
//        return new EqualsBuilder()
//                .append(userName, userInfo.userName)
//                .append(age, userInfo.age)
//                .isEquals();

        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(userName)
                .append(age)
                .toHashCode();
    }


    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("aaa");
        userInfo.setAge("100");

        System.out.println("===" + userInfo.hashCode() );
    }

}
