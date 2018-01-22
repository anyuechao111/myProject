/** 
 * <pre>项目名称:dubbo-producer 
 * 文件名称:TestMapper.java 
 * 包名:com.jk.dao 
 * 创建日期:2018年1月17日下午9:30:34 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jk.pojo.Test;

/** 
 * <pre>项目名称：dubbo-producer    
 * 类名称：TestMapper    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月17日 下午9:30:34    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月17日 下午9:30:34    
 * 修改备注：       
 * @version </pre>    
 */
public interface TestMapper {

	/** <pre>getTotal(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 上午9:44:04    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 上午9:44:04    
	 * 修改备注： 
	 * @return</pre>    
	 */
	public Integer getTotal();

	/** <pre>querylist(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 上午9:46:17    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 上午9:46:17    
	 * 修改备注： 
	 * @param start
	 * @param pageSize
	 * @return</pre>    
	 */
	public List<Test> querylist(@Param("start") Integer start, @Param("pageSize") Integer pageSize);

}
