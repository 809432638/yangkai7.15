package com.yangkai_Assset.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class AsssetYangkaiTest {

	//	//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testIsTrue() {
//	    String pwd1="111";
//		String pwd2="112";
//		AsssetYangkai.isTrue(pwd1.equals(pwd2), "为假，则抛出自定义异常,密码不相等");
		
		//为真,不抛异常
		String pwd3="110";
		String pwd4="110";
		AsssetYangkai.isTrue(pwd3.equals(pwd4),"为真,不抛异常");
	}

	
	//方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testIsFalse() {
		AsssetYangkai.isFalse(1>2, "为真，则抛出自定义异常-->表达式为假");
		
		//为假,不抛异常
		//AsssetYangkai.isFalse(1>2, "为假,不抛异常");
	}

	
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testNotNull() {
		
		//AsssetYangkai.notNull(null, "为空，则抛出自定义异常-->对象为空");
		
		//对象不为空,不抛异常
		AsssetYangkai.notNull("老师辛苦了", "对象不为空,不抛异常");
	}

	
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testIsNull() {
		//AsssetYangkai.isNull("老师辛苦了", "对象不为空，则抛出自定义异常-->对象不为空");
		
		//对象为空,不抛异常
		AsssetYangkai.isNull(null, "对象为空,不抛异常");
	}

	
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testNotEmptyCollectionOfQString() {
	
//		Set s1=new HashSet();
//		s1.add(null);
//		AsssetYangkai.notEmpty(s1, "集合为空则抛出自定义异常-->该集合为空");
		
		//集合不为空,不抛异常
		Set s=new HashSet();
		s.add("老师好");
		AsssetYangkai.notEmpty(s, "集合不为空,不抛异常");
	}

	
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testNotEmptyMapOfQQString() {
		
		Map m1 =new HashMap();
		m1.put(1,1);
		AsssetYangkai.notEmpty(m1, "集合为空则抛出自定义异常-->该集合为空");
		
		//集合不为空,不抛异常
//		Map m =new HashMap();
//		m.put("老师辛苦", "辛苦");
//		AsssetYangkai.notEmpty(m, "集合不为空,不抛异常");
	}

	
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testHasText() {
		
//		AsssetYangkai.hasText(null, "符串必须有值没值，则抛出自定义异常-->字符串没值");
		
		//字符串有值不抛异常
		AsssetYangkai.hasText("  ", "字符串有值不抛异常");
	}

	
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	@Test
	public void testGreaterThanZero() {
		
	/*	BigDecimal b=new BigDecimal("23");
		AsssetYangkai.greaterThanZero(b, "断言值必须大于0,果小于或等于0，则抛出自定义异常");*/
		
		
		//断言值必须大于0,不抛异常
		BigDecimal b1=new BigDecimal("0");
		
		AsssetYangkai.greaterThanZero(b1, "断言值必须大于0则不抛异常");
	}

}
