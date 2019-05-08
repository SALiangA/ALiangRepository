package com.gec.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gec.domain.User;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	//提交的地址，将被这个方法所拦截
	@Override
	public boolean preHandle(HttpServletRequest req,
			HttpServletResponse resp, Object obj)
			throws Exception {
		System.out.println("{interceptorAdapter}拦截了一个请求");
		HttpSession session = req.getSession(false);
		if(session!=null) {
			User user = (User) session.getAttribute("user");
			if(user!=null) {
				System.out.println("验证通过了，已经登录了（放行）");
				return true;//放行
			}
		}
		System.out.println("不好意思，你未登录");
		String ctxpath = req.getContextPath();
		resp.sendRedirect(ctxpath+"/error.jsp");//重定向到错误页
		return false; //不放行
	}
	//完成后
	@Override
	public void afterCompletion(HttpServletRequest request, 
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}
	//并发处理启动后
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
			throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	//处理后
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

}
