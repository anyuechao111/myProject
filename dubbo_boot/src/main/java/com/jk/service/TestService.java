/** 
 * <pre>项目名称:dubbo-boot-producer 
 * 文件名称:TestService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年1月18日下午7:50:13 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;


import com.jk.pojo.Test;

/** 
 * <pre>项目名称：dubbo-boot-producer    
 * 类名称：TestService    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月18日 下午7:50:13    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月18日 下午7:50:13    
 * 修改备注：       
 * @version </pre>    
 */
public interface TestService {

	/** <pre>selectInfo(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 下午8:15:31    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 下午8:15:31    
	 * 修改备注： 
	 * @param test
	 * @return</pre>    
	 */
	Test selectInfo(Test test);

	/** <pre>saveOrUpdateInfo(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 下午10:34:41    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 下午10:34:41    
	 * 修改备注： 
	 * @param test</pre>    
	 */
	void saveOrUpdateInfo(Test test);
}
