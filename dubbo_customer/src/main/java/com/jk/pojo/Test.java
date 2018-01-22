/** 
 * <pre>项目名称:dubbo-producer 
 * 文件名称:Test.java 
 * 包名:com.jk.pojo 
 * 创建日期:2018年1月17日下午9:30:57 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/** 
 * <pre>项目名称：dubbo-producer    
 * 类名称：Test    
 * 类描述：    
 * 创建人：安月朝 anyuechao@126.com    
 * 创建时间：2018年1月17日 下午9:30:57    
 * 修改人：安月朝 anyuechao@126.com  
 * 修改时间：2018年1月17日 下午9:30:57    
 * 修改备注：       
 * @version </pre>    
 */
public class Test implements Serializable {

	private static final long serialVersionUID = -2308663206243600283L;
	
	private Integer id;
	
	private String name;
	
	private Double price;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	private String showDate;

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@JsonFormat(pattern="yyyy-mm-dd",timezone="GMT+8")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + "]";
	}
	

}
