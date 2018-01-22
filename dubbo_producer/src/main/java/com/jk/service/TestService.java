/** 
 * <pre>项目名称:dubbo-producer 
 * 文件名称:TestService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年1月17日下午9:27:44 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.Map;

/** 
 * <pre>项目名称：dubbo-producer    
 * 类名称：TestService    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月17日 下午9:27:44    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月17日 下午9:27:44    
 * 修改备注：       
 * @version </pre>    
 */
public interface TestService {


	/** <pre>querylist(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 上午9:39:35    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 上午9:39:35    
	 * 修改备注： 
	 * @param start
	 * @param pageSize
	 * @return</pre>    
	 */
	Map<String, Object> querylist(Integer start, Integer pageSize);
}
