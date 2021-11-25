package com.mycompany.myapp09.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.member.model.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	public MemberDAO memberDAO;
	@Override
	public int idCheck(String id) throws Exception {
		return memberDAO.idCheck(id);
	}
}
