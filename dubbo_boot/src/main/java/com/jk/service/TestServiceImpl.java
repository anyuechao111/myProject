/** 
 * <pre>项目名称:dubbo-boot-producer 
 * 文件名称:TestServiceImpl.java 
 * 包名:com.jk.service 
 * 创建日期:2018年1月18日下午7:50:28 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.TestMapper;
import com.jk.pojo.Test;

/** 
 * <pre>项目名称：dubbo-boot-producer    
 * 类名称：TestServiceImpl    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月18日 下午7:50:28    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月18日 下午7:50:28    
 * 修改备注：       
 * @version </pre>    
 */
@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper testMapper;

	/**
	 * 查询
	 */
	@Override
	public Test selectInfo(Test test) {
		test = testMapper.selectInfo(test);
		return test;
	}

	/**
	 * 修改
	 */
	@Override
	public void saveOrUpdateInfo(Test test) {
		testMapper.saveOrUpdateInfo(test);
	}


}
