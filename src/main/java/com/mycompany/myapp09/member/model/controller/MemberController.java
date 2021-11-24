package com.mycompany.myapp09.member.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MemberController {
	
	//아이디 중복 체크 화면
	
	
	
	@GetMapping
	//아이디 중복 체크 URL을 매핑하여 서비스를 호출하고 결과를 받환하는 메소드
	public String idCheck() throws Exception { //idCheck는 int로 
		return "";
	}
}
