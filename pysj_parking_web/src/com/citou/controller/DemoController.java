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
@RequestMapping("/demo")//��controller�ĸ�·��
public class DemoController {

	@Autowired
	DemoService demoService;

	/**
	 * ����json�����ӣ���������ֵ�����޸ĳ�list��map����������
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
	 * ��ȡǰ̨����,��������Ϳ�ʡ�Բ���
	 */
	@RequestMapping("/paramReq")
	public void paramHandler(@RequestParam("id")String id,
			@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "currentPage", required = false) Integer currentPage)
	{
		//TODO:�����߼�
	}
	
	/**
	 * ͨ��ԭ��servlet��ȡ����������
	 * ҳ����ת������
	 */
	@RequestMapping(value = "/logOut")
	public ModelAndView loginOut(HttpServletRequest request,
			HttpServletResponse response) {
		request.getSession().invalidate();
		//ҳ����תҳ���Դ�����
		//return new ModelAndView("index",new ModelMap());
		return new ModelAndView("index");
	}
}
