<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper 
PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" 
"http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="deptmapper">
	<resultMap id="memberResultSet" type="Member">
		<id column="USER_NO" property="userNo"/>
		<result column="USER_ID" property="userId"/>
		<result column="USER_PWD" property="userPwd"/>
		<result column="USER_NAME" property="userName"/>
		<result column="EMAIL" property="email"/>
		<result column="birThDay" property="birthday"/>
		<result column="gender" property="gender"/>
		<result column="phone" property="phone"/>
		<result column="address" property="address"/>
		<result column="enroll_date" property="enrollDate"/>
		<result column="modify_date" property="modifyDate"/>
		<result column="status" property="status"/>
	</resultMap>
	<select id="loginMember" parameterType="Member"
  						   resultMap="memberResultSet">
	</select>
</mapper>









