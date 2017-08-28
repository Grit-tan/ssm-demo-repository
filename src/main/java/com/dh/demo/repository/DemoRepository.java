package com.dh.demo.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dh.demo.model.Demo;

@Repository
public class DemoRepository {
	@Resource
	private SqlSessionTemplate template;
	
	public List<Demo> DemosQuery(Integer id){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		return template.selectList("com.dh.demo.repository.DemoMapper.getDemo", map);
	}
}
