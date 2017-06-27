package com.laber.controller;

import com.alibaba.fastjson.parser.deserializer.StringFieldDeserializer;
import com.laber.model.BbsUser;
import com.laber.services.BbsUserServices;
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
public class IELoginController {

    @Autowired
    @Qualifier("UserServices")
    BbsUserServices userServices;

    @RequestMapping("/login")
    @ResponseBody
    public BbsUser doLogin(HttpServletRequest request, HttpServletResponse response){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        BbsUser user = userServices.seclectUserByNameAndPass(userName,passWord);
        System.out.print("phoneNumber"+user.getPhoneNumber());
        return user;
    }


    public void registerUser(HttpServletRequest request,HttpServletResponse response){
        String phone = request.getParameter("phone");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");


    }

}
