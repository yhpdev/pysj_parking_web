package com.citou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citou.dao.DemoDao;
import com.citou.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	DemoDao demoDao;

	@Override
	public String test() {
		String result = demoDao.getResult();
		//TODO:�������һЩ���ϵĴ���

		return result;
	}
}
