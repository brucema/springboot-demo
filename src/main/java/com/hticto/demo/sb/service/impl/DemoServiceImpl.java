package com.hticto.demo.sb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hticto.demo.sb.service.dao.DemoDao;
import com.hticto.demo.sb.service.iface.DemoService;

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
