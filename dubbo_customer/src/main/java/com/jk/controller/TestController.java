/** 
 * <pre>项目名称:dubbo-customer 
 * 文件名称:TestController.java 
 * 包名:com.jk.controller 
 * 创建日期:2018年1月17日下午9:33:31 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jk.pojo.Test;
import com.jk.service.TestService;

/** 
 * <pre>项目名称：dubbo-customer    
 * 类名称：TestController    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月17日 下午9:33:31    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月17日 下午9:33:31    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("querylist")
	@ResponseBody
	public Map<String,Object> querylist(Integer start, Integer pageSize){
		Map<String,Object> map = testService.querylist(start,pageSize);
		return map;
	}
	
	@RequestMapping("toUpdatePage")
	@ResponseBody
	public ModelAndView toUpdatePage(Test test){
		test = testService.selectInfo(test);
		ModelAndView mv = new ModelAndView();
		mv.addObject("test", test);
		mv.setViewName("updatePage");
		return mv;
	}
	
	@RequestMapping("saveOrUpdateInfo")
	@ResponseBody
	public Integer saveOrUpdateInfo(Test test){
		testService.saveOrUpdateInfo(test);
		return 1;
	}
}
