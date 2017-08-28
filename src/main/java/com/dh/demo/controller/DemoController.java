package com.dh.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dh.demo.model.Demo;
import com.dh.demo.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@Resource
	private DemoService demoService;
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request,Model model) {
		List<Demo> demo =demoService.DemosQuery(1);
		model.addAttribute("list", demo);
		return "index";
	}
}
