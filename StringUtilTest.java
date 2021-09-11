package de.tilman_neumann.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringUtilTest 
{

	@Test
	void repeatTest1() 
	{
		//AAA
		String s= "test";
		int n=-1;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest2() 
	{
		//AAA
		String s= "test";
		int n=1;
		String result = StringUtil.repeat(s, n);
		assertEquals("test", result);
	}
	@Test
	void repeatTest3() 
	{
		//AAA
		String s= "test";
		int n=0;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest4() 
	{
		//AAA
		String s= null;
		int n=1;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest5() 
	{
		//AAA
		String s= "";
		int n=2;
		String result = StringUtil.repeat(s, n);
		assertEquals("", result);
	}
	@Test
	void repeatTest6() 
	{
		//AAA
		String s= null;
		int n=-2;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest7() 
	{
		//AAA
		String s= null;
		int n=0;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest8() 
	{
		//AAA
		String s= "";
		int n=-2;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest9() 
	{
		//AAA
		String s= "";
		int n=0;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
///////////////////////////////////////////////////////////////////
	@Test
	void formatLeftTest1() 
	{
		//AAA
		String s= "ab";
		String mask="123456";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("ab3456", result);
	}
	@Test
	void formatLeftTest2() 
	{
		//AAA
		String s= "";
		String mask="123";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("123", result);
	}
	@Test
	void formatLeftTest3() 
	{
		//AAA
		String s= "abcefd";
		String mask="";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcefd", result);
	}
	@Test
	void formatLeftTest4() 
	{
		//AAA
		String s= "abcefd";
		String mask=null;
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcefd", result);
	}
	@Test
	void formatLeftTest5() 
	{
		//AAA
		String s= null;
		String mask="123";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("123", result);
	}
	@Test
	void formatLeftTest6() 
	{
		//AAA
		String s= null;
		String mask=null;
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatLeftTest7() 
	{
		//AAA
		String s= "";
		String mask=null;
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
	void formatLeftTest8() 
	{
		//AAA
		String s= "";
		String mask="";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
///////////////////////////////////////////////////////////////
	@Test
	void formatRightTest1() 
	{
		//AAA
		String s= "ab";
		String mask="123456";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("1234ab", result);
	}
	@Test
	void formatRightTest2() 
	{
		//AAA
		String s= "";
		String mask="123";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("123", result);
	}
	@Test
	void formatRightTest3() 
	{
		//AAA
		String s= "abcefd";
		String mask="";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("abcefd", result);
	}
	@Test
	void formatRightTest4() 
	{
		//AAA
		String s= "abcefd";
		String mask=null;
		String result = StringUtil.formatRight(s, mask);
		assertEquals("abcefd", result);
	}
	@Test
	void formatRightTest5() 
	{
		//AAA
		String s= null;
		String mask="123";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("123", result);
	}
	@Test
	void formatRightTest6() 
	{
		//AAA
		String s= null;
		String mask=null;
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest7() 
	{
		//AAA
		String s= null;
		String mask="";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest8() 
	{
		//AAA
		String s= "";
		String mask=null;
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest9() 
	{
		//AAA
		String s= "";
		String mask="";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}

}