/** 
 * <pre>项目名称:dubbo-boot-producer 
 * 文件名称:TestMapper.java 
 * 包名:com.jk.dao 
 * 创建日期:2018年1月18日下午7:51:29 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jk.pojo.Test;

/** 
 * <pre>项目名称：dubbo-boot-producer    
 * 类名称：TestMapper    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月18日 下午7:51:29    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月18日 下午7:51:29    
 * 修改备注：       
 * @version </pre>    
 */
@Mapper
public interface TestMapper {

	/** <pre>selectInfo(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 下午8:17:50    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 下午8:17:50    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@ResultType(com.jk.pojo.Test.class)
	@Select(value="select shopid as id, shopname as name, shopprice as price,"
			+ "DATE_FORMAT(shopdate,\"%y-%m-%d\") AS showDate from  a_shop where shopid = #{test.id}")
	Test selectInfo(@Param("test") Test test);

	/** <pre>saveOrUpdateInfo(这里用一句话描述这个方法的作用)   
	 * 创建人：安月朝 anyuechao@126.com     
	 * 创建时间：2018年1月18日 下午10:35:35    
	 * 修改人：安月朝 anyuechao@126.com      
	 * 修改时间：2018年1月18日 下午10:35:35    
	 * 修改备注： 
	 * @param test</pre>    
	 */
	@Update(value="update a_shop set "+
					"shopname = #{test.name},"+
					"shopprice = #{test.price},"+
					"shopdate = #{test.date} "+
					"where shopid = #{test.id}")
	void saveOrUpdateInfo(@Param("test") Test test);

}
