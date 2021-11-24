package com.mycompany.myapp09.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.member.model.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	public MemberDAO memberDAO;
	public int idCheck() throws Exception {
		return memberDAO.idCheck();
	}
}
