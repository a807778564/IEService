package com.laber.services.impl;

import com.laber.dao.BbsUserMapper;
import com.laber.dao.BbsUserTokenMapper;
import com.laber.model.BbsUser;
import com.laber.model.BbsUserToken;
import com.laber.services.BbsUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangrensheng on 2017/6/27.
 */
@Service("UserServices")
public class BbsUserServicesImpl implements BbsUserServices {

    @Autowired
    BbsUserMapper userDao;

    @Override
    public BbsUser seclectUserByNameAndPass(String userName, String passWord) {
        return userDao.seclectUserByNameAndPass(userName,passWord);
    }

    @Override
    public int insertUser(String userName, String passWord, String phone) {
        return userDao.insertUser(userName,passWord,phone);
    }

    @Override
    public BbsUser selectUserInfoByToken(String token) {
        return userDao.selectUserInfoByToken(token);
    }

    @Autowired
    BbsUserTokenMapper tokenDao;

    @Override
    public int insert(BbsUserToken userToken) {
        return  tokenDao.insert(userToken);
    }

    @Override
    public BbsUserToken selectByUserId(int userId) {
        return tokenDao.selectByUserId(userId);
    }

    @Override
    public int updateTokenByUserId(int userId, String token) {
        return tokenDao.updateTokenByUserId(userId,token);
    }

    @Override
    public int deleteToken(String token) {
        return tokenDao.deleteToken(token);
    }
}
