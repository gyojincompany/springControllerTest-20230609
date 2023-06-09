package com.gyojincompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	@RequestMapping(value = "/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value = "/list")
	public String list() {
		return "board/list";//views 폴더안에 있는 다른 폴더안에 있는 jsp 실행
	}
	
	@RequestMapping(value = "/view")
	public String view() {
		return "view";
	}
	
}
