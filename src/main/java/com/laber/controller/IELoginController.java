package com.laber.controller;

import com.alibaba.fastjson.parser.deserializer.StringFieldDeserializer;
import com.laber.controller.Base.IEBaseController;
import com.laber.model.BbsUser;
import com.laber.model.BbsUserToken;
import com.laber.model.jsonModel.IEJsonModel;
import com.laber.services.BbsUserServices;
import com.laber.utils.IEUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by huangrensheng on 2017/6/27.
 */
@Controller
public class IELoginController extends IEBaseController {

    @Autowired
    @Qualifier("UserServices")
    BbsUserServices userServices;

    @RequestMapping("/login")
    @ResponseBody
    public IEJsonModel doLogin(HttpServletRequest request, HttpServletResponse response){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        BbsUser user = userServices.seclectUserByNameAndPass(userName,passWord);
        if (user != null){
            BbsUserToken token = new BbsUserToken();
            token.setUserId(user.getId());
            token.setUserName(user.getUserName());
            token.setEndTime(IEUtils.getStringDataNow());
            token.setToken(IEUtils.getToken(new StringBuffer().append(user.getUserName()).append(token.getEndTime()).toString()));

            BbsUserToken selectToken = userServices.selectByUserId(user.getId());
            int succ = 0;
            if (selectToken != null){
                succ = userServices.updateTokenByUserId(token.getUserId(),token.getToken());
            }else {
                succ = userServices.insert(token);
            }
            if (succ>0) {
                jsonModel.code = 1;
                jsonModel.message = "";
                jsonModel.data = token.getToken();
                return jsonModel;
            }
        }
        jsonModel.code = 0;
        jsonModel.message = "用户名或密码错误";
        jsonModel.data = null;
        return jsonModel;
    }

    @RequestMapping("/register")
    @ResponseBody
    public IEJsonModel registerUser(HttpServletRequest request,HttpServletResponse response){
        String phone = request.getParameter("phone");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        int code = userServices.insertUser(userName,passWord,phone);
        System.out.print("code = "+code);
        if (code>0){
            jsonModel.code = 1;
            jsonModel.message = "";
            jsonModel.data = null;
            return jsonModel;
        }
        jsonModel.code = 0;
        jsonModel.message = "注册失败";
        jsonModel.data = null;
        return jsonModel;
    }

    @RequestMapping("/userInfo")
    @ResponseBody
    public  IEJsonModel selectUserInfo(HttpServletRequest request,HttpServletResponse response){
        String token = request.getParameter("token");
        BbsUser user = userServices.selectUserInfoByToken(token);
        if (user != null){
            jsonModel.code = 1;
            jsonModel.message = "获取用户信息成功";
            jsonModel.data = user;
            return jsonModel;
        }
        jsonModel.code = 0;
        jsonModel.message = "获取用户信息失败!";
        jsonModel.data = null;
        return jsonModel;
    }

}
