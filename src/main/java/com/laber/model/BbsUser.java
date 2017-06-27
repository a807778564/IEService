package com.laber.model;

public class BbsUser {
    private Integer id;

    private String userName;

    private String passWord;

    private Integer age;

    private String phoneNumber;

    private String email;

    private String iconUrl;

    private Integer sex;

    public BbsUser(Integer id, String userName, String passWord, Integer age, String phoneNumber, String email, String iconUrl, Integer sex) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.iconUrl = iconUrl;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public Integer getSex() {
        return sex;
    }
}