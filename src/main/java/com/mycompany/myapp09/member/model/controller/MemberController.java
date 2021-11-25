package com.mycompany.myapp09.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	//아이디 중복 체크 화면
	
	
	
	@PostMapping("idCheck")
	@ResponseBody
	public String idCheck(@RequestParam("id") String id) {
		System.out.println("id : " + id);
		
		String resultStr = "";
		int result = 0;
		try {
			result = memberservice.idCheck(id);
		} catch (Exception e) {
			e.printStackTrace();
			resultStr = "ajax 통신 실패";
		}
		if (result == 1) {
			resultStr = "false";
		} else {
			resultStr = "true";
		}
		return resultStr;
	}
}
