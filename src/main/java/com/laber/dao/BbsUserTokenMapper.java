package com.laber.dao;

import com.laber.model.BbsUser;
import com.laber.model.BbsUserToken;
import org.apache.ibatis.annotations.*;

public interface BbsUserTokenMapper {
    @Delete({
        "delete from bbs_user_token",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into bbs_user_token (id, user_id, ",
        "user_name, token, ",
        "end_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{userName,jdbcType=VARCHAR}, #{token,jdbcType=VARCHAR}, ",
        "#{endTime,jdbcType=VARCHAR})"
    })
    int insert(BbsUserToken record);

    int insertSelective(BbsUserToken record);

    @Select({
        "select",
        "id, user_id, user_name, token, end_time",
        "from bbs_user_token",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    BbsUserToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BbsUserToken record);

    @Update({
        "update bbs_user_token",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "token = #{token,jdbcType=VARCHAR},",
          "end_time = #{endTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BbsUserToken record);

    BbsUserToken selectByUserId(@Param("userId")int userId);

    int updateTokenByUserId(@Param("userId")int userId,@Param("token")String token);

    int deleteToken(@Param("token")String token);
}