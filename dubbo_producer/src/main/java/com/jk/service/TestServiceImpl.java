/** 
 * <pre>项目名称:dubbo-producer 
 * 文件名称:TestServiceImpl.java 
 * 包名:com.jk.service 
 * 创建日期:2018年1月17日下午9:28:04 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.jk.dao.TestMapper;
import com.jk.pojo.Test;

/** 
 * <pre>项目名称：dubbo-producer    
 * 类名称：TestServiceImpl    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月17日 下午9:28:04    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月17日 下午9:28:04    
 * 修改备注：       
 * @version </pre>    
 */
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	/**
	 * 查询方法
	 */
	@Override
	public Map<String, Object> querylist(Integer start, Integer pageSize) {
		Integer total = testMapper.getTotal();
		List<Test> list = testMapper.querylist(start,pageSize);
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

}
