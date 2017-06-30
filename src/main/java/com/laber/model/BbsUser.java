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

    public BbsUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}