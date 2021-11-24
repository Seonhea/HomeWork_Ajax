package com.mycompany.myapp09.member.model.dao;

import java.lang.reflect.Member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public int idCheck(Member vo) throws Exception {
		int result = sqlSessionTemplate.selectOne("Member.idCheck", vo);
		return result;
	}
}
