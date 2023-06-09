package com.gyojincompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		
		return "hello";
	}
	
	@RequestMapping(value = "/springtest")
	public String springtest() {
		return "spring";
	}
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/BlogHome.Naver")
	public String blognaver() {
		return "blog";
	}
	
	@RequestMapping(value = "/google")
	public String google() {
		return "image";
	}
	
	@RequestMapping(value = "/memberinfo")
	public String memberinfo(Model model) {
		
		//원래는 DB에서 데이터를 가져옴
		String memberId = "tiger";
		String memberName = "홍길동";
		int memberAge = 15;
		
		model.addAttribute("mid", memberId);
		model.addAttribute("mname", memberName);
		model.addAttribute("mage", memberAge);		
		
		return "memberinfo";		
	}
	
	
}
