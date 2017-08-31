package com.hticto.demo.sb.service.dao;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoDao {
	
	String selectById(@PathParam("id") int id);
}
