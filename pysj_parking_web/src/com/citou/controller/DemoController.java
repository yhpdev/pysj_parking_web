package com.citou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.citou.service.DemoService;

@Controller
@RequestMapping("/demo")//该controller的父路径
public class DemoController {

	@Autowired
	DemoService demoService;

	/**
	 * 返回json的例子，函数返回值可以修改成list，map等其他类型
	 * @return
	 */
	@RequestMapping("/ajaxGetReq")
	@ResponseBody
	public ModelMap ajaxGetReqHandler()
	{
		String code = demoService.test();

		ModelMap map = new ModelMap();
		map.put("code", code);
		return map;
	}

	/**
	 * 获取前台参数,必须参数和可省略参数
	 */
	@RequestMapping("/paramReq")
	public void paramHandler(@RequestParam("id")String id,
			@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "currentPage", required = false) Integer currentPage)
	{
		//TODO:完善逻辑
	}
	
	/**
	 * 通过原生servlet获取参数的例子
	 * 页面跳转的例子
	 */
	@RequestMapping(value = "/logOut")
	public ModelAndView loginOut(HttpServletRequest request,
			HttpServletResponse response) {
		request.getSession().invalidate();
		//页面跳转页可以带参数
		//return new ModelAndView("index",new ModelMap());
		return new ModelAndView("index");
	}
}
