package com.laber.services.impl;

import com.laber.dao.BbsUserMapper;
import com.laber.model.BbsUser;
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
}
