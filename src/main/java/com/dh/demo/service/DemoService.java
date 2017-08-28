package com.dh.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dh.demo.model.Demo;
import com.dh.demo.repository.DemoRepository;

@Service
public class DemoService {
	@Resource
	private DemoRepository demoRepository;
	
	public List<Demo> DemosQuery(Integer id){
		return demoRepository.DemosQuery(id);
	}
}
