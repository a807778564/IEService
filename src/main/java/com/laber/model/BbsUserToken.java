package com.laber.model;

public class BbsUserToken {
    private Integer id;

    private Integer userId;

    private String userName;

    private String token;

    private String endTime;

    public BbsUserToken(Integer id, Integer userId, String userName, String token, String endTime) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.token = token;
        this.endTime = endTime;
    }

    public BbsUserToken() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }
}