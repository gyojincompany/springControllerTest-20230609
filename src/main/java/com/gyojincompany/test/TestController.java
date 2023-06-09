package com.gyojincompany.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		String memberId = "whiteCat";
		String memberName = "이순신";
		int memberAge = 27;
		
		model.addAttribute("mid", memberId);
		model.addAttribute("mname", memberName);
		model.addAttribute("mage", memberAge);		
		
		return "memberinfo";
	}
	
	@RequestMapping(value = "/memberinfo2")
	public ModelAndView memberinfo2(ModelAndView mv) {
		
		String memberId = "redDog";
		String memberName = "김유신";
		int memberAge = 19;
		
		mv.addObject("mid", memberId);
		mv.addObject("mname", memberName);
		mv.addObject("mage", memberAge);
		
		mv.setViewName("memberinfo");//실행하려는 jsp파일(view)의 이름까지 넣어 줌
		
		return mv;
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		
		model.addAttribute("memberId", mid);
		model.addAttribute("memberPw", mpw);
		
		return "loginOk";
	}
	
}
