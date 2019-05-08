package com.gec.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gec.domain.User;
import com.gec.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login( User user, HttpServletRequest req ){
		System.out.println("{debug} 你已经成功访问: login(); ");
		User svUser = userService.doLogin( user );
		HttpSession session = null;
		//{ps} 错误页 ..
		String url = "redirect:/jsp/error.jsp?errcode=1";  
		if( svUser!=null ){
			//{ps} 证明你是登陆了 ..
			session = req.getSession();
			//{ps} 放入一个 User 对象到会话域 ..
			session.setAttribute("user", svUser);
			url = "redirect:/User/index";
			System.out.println("{debug} 你已经成功登录了 ..");
		}
		return url;
	}
	//ConversionServiceFactoryBean 
	@RequestMapping("/edit")
	public String edit(){
		System.out.println("{debug} 你成功访问了: edit();");
		return null;
	}
	
	@RequestMapping("/delete")
	public String delete(){
		System.out.println("{debug} 你成功访问了: delete();");
		return null;
	}

	@RequestMapping("/index")
	public String index(){
		return "redirect:/index.jsp";
	}
	
}

