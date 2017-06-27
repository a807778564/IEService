package com.laber.services;

import com.laber.model.BbsUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huangrensheng on 2017/6/27.
 */
public interface BbsUserServices {
    /*登录*/
    public BbsUser seclectUserByNameAndPass(@Param("userName")String userName, @Param("passWord") String passWord);
}
