package com.yangkai_Assset.utils;

/**
 * 
 * @ClassName: CmsException 
 * @Description: 自定义异常类
 * @author: 嫌疑人:杨某 
 * @date: 2019年7月15日 上午8:40:45
 */
public class CmsException extends RuntimeException{

	/**
	 * 
	 * @Title:CmsException
	 * @Description:无参构造方法
	 */
	public CmsException() {
		super();
	}
	
	
	/**
	 * 
	 * @Title:CmsException
	 * @Description:有参构造方法
	 * @param message
	 */
	public CmsException(String message) {
		super(message);
	}
}
