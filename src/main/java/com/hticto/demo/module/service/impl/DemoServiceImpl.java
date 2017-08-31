package com.hticto.demo.module.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hticto.demo.module.service.dao.DemoDao;
import com.hticto.demo.module.service.iface.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoDao dao;

	@Override
	public String getMessage() {
		return "hello, this is demo service";
	}

	@Override
	public String getMessage(int id) {
		return dao.selectById(id);
	}

}
