package com.laber.services;

import com.laber.model.BbsUser;
import com.laber.model.BbsUserToken;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huangrensheng on 2017/6/27.
 */
public interface BbsUserServices {
    /*登录*/
    public BbsUser seclectUserByNameAndPass(@Param("userName")String userName, @Param("passWord") String passWord);

    /*注册*/
    int insertUser(@Param("userName")String userName,@Param("passWord") String passWord,@Param("phone") String phone);

    /*插入token信息*/
    int insert(BbsUserToken userToken);

    /*查询token信息*/
    BbsUserToken selectByUserId(@Param("userId")int userId);

    /*跟新token信息*/
    int updateTokenByUserId(@Param("userId")int userId,@Param("token")String token);

    /*根据token获取用户信息*/
    BbsUser selectUserInfoByToken(@Param("token")String token);

    /*删除登录token信息*/
    int deleteToken(@Param("token")String token);
}
