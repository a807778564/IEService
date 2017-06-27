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

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getToken() {
        return token;
    }

    public String getEndTime() {
        return endTime;
    }
}