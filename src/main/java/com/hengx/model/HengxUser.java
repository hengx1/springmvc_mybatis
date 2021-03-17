package com.hengx.model;

import java.io.Serializable;

/**
 * @Author xcp
 * @date 2020/11/22 12:03
 */
public class HengxUser implements Serializable {
    private  Integer id;
    private Integer age;
    private  String name;
    private  String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HengxUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
