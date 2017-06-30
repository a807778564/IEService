package com.laber.dao;

import com.laber.model.BbsUser;
import org.apache.ibatis.annotations.*;

public interface BbsUserMapper {
    @Delete({
        "delete from bbs_user",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into bbs_user (Id, user_name, ",
        "pass_word, age, phone_number, ",
        "email, icon_url, ",
        "sex)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{passWord,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER}, #{phoneNumber,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{iconUrl,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=INTEGER})"
    })
    int insert(BbsUser record);

    int insertSelective(BbsUser record);

    @Select({
        "select",
        "Id, user_name, pass_word, age, phone_number, email, icon_url, sex",
        "from bbs_user",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    BbsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BbsUser record);

    @Update({
        "update bbs_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "pass_word = #{passWord,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "phone_number = #{phoneNumber,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "icon_url = #{iconUrl,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER}",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BbsUser record);

    /*登录*/
    BbsUser seclectUserByNameAndPass(@Param("userName")String userName, @Param("passWord") String passWord);

    /*注册*/
    int insertUser(@Param("userName")String userName,@Param("passWord") String passWord,@Param("phone") String phone);

    BbsUser selectUserInfoByToken(@Param("token")String token);
}