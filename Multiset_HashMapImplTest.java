package de.tilman_neumann.util;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class Multiset_HashMapImplTest 
{
	Multiset_HashMapImpl x = new Multiset_HashMapImpl();
	Multiset<String> multiset =new  Multiset_HashMapImpl();
	Multiset<Double> multiset1 =new  Multiset_HashMapImpl();
	Multiset<String> multiset2 =new  Multiset_HashMapImpl();
	@Rule public final ExpectedException exception = ExpectedException.none();

	@Test
	public void addTest() 
	{
		//AAA
		String entry = "test";
		int mult = -1;
		int result = x.add(entry, mult);
		assertEquals(0, result);
	}
	@Test
	public void addTest2() 
	{
		//AAA
		String entry = "test";
		int mult = 0;
		int result = x.add(entry, mult);
		assertEquals(0, result);
	}
	@Test
	public void addTest3() 
	{
		//AAA
		double entry = 1.2;
		int mult = 2;
		int result = x.add(entry, mult);
		assertEquals(0, result);
	}
	@Test
	public void addTest4() 
	{
		//AAA
		int entry = -1;
		int mult = 1;
		int result = x.add(entry, mult);
		assertEquals(0, result);
	}
	@Test
	public void addTest5() 
	{
		//AAA
		String entry = null;
		int mult = 1;
		int result = x.add(entry, mult);
		assertEquals(0, result);
	}
	@Test
	public void addTest6() 
	{
		//AAA
		String entry = " ";
		int mult = 1;
		int result = x.add(entry, mult);
		assertEquals(0, result);
	}
/////////////////////////////////////////////////////////////////
	@Test
	public void addEntryTest1() 
	{
		//AAA
		String entry = " ";
		int result = x.add(entry);
		assertEquals(0, result);
	}
	@Test
	public void addEntryTest2() 
	{
		//AAA
		double entry = Integer.MAX_VALUE;
		int result = x.add(entry);
		assertEquals(0, result);
	}
	@Test
	public void addEntryTest3() 
	{
		//AAA
		String entry = "Test";
		int result = x.add(entry);
		assertEquals(0, result);
	}
	@Test
	public void addEntryTest4() 
	{
		//AAA
		String entry = null;
		int result = x.add(entry);
		assertEquals(0, result);
	}
	@Test
	public void addEntryTest5() 
	{
		//AAA
		int entry = -1;
		int result = x.add(entry);
		assertEquals(0, result);
	}
///////////////////////////////////////////////////////////////////
	@Test
	public void addAllMultiTest1() 
	{
		//AAA
		multiset1.add(Double.MAX_VALUE);
		multiset1.add(6.3);
		multiset1.add(1.8);
		multiset1.add(1.8);
		multiset1.add(9.8);
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(multiset1, 1);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(multiset1);
		int y = x.totalCount();		
		assertEquals(5, y);
	}
	@Test
	public void addAllMultiTest2() 
	{
		//AAA
		multiset.add("Nada");
		multiset.add("Sarah");
		multiset.add("Mark");
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(multiset, 1);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(multiset);
		int y = x.totalCount();		
		assertEquals(3, y);
	}
	@Test
	public void addAllMultiTest3() 
	{
		//AAA
		multiset = null;
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(multiset, 1);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(multiset);
		int y = x.totalCount();		
		assertEquals(0, y);
	}
//////////////////////////////////////////////////////////////////
	@Test
	public void addAllCollTest1() 
	{
		//AAA
		Collection<String> collect = new ArrayList<String>();
		collect.add("A");
		collect.add("Computer");
		collect.add("Portal");
		collect.add("for");
		collect.add("Geeks");
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(collect);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(collect);
		int y = x.totalCount();		
		assertEquals(5, y);
	}
	@Test
	public void addAllCollTest2() 
	{
		//AAA
		Collection<Double> collect = new ArrayList<Double>();
		collect.add(1.3);
		collect.add(5.2);
		collect.add(9.4);
		collect.add(1.2);
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(collect);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(collect);
		int y = x.totalCount();		
		assertEquals(4, y);
	}
	@Test
	public void addAllCollTest3() 
	{
		//AAA
		Collection<Double> collect = null;
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(collect);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(collect);
		int y = x.totalCount();		
		assertEquals(0, y);
	}
/////////////////////////////////////////////////////////////////
	@Test
	public void addAllArrayTest1() 
	{
		//AAA
		Object[] object = {"Mark", "Sarah", 1.3, 1.9};
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(object);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(object);
		int y = x.totalCount();		
		assertEquals(4, y);
	}
	@Test
	public void addAllArrayTest2() 
	{
		//AAA
		Object[] object = {"Mark", "Sarah", "Nada", "Ayat"};
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(object);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(object);
		int y = x.totalCount();		
		assertEquals(4, y);
	}
	@Test
	public void addAllArrayTest3() 
	{
		//AAA
		Object[] object = {1.2,3.5,1,9,2.8};
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(object);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(object);
		int y = x.totalCount();		
		assertEquals(5, y);
	}
	@Test
	public void addAllArrayTest4() 
	{
		//AAA
		Object[] object = null;
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(object);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(object);
		int y = x.totalCount();		
		assertEquals(0, y);
	}
	@Test
	public void addAllArrayTest5() 
	{
		//AAA
		Object[] object = {};
		Mockery mockingContext;
		mockingContext = new Mockery();
		Multiset mockedObject = mockingContext.mock(Multiset.class);
		mockingContext.checking(new Expectations(){
		{
			oneOf(mockedObject).add(object);
			will(returnValue(1));
		}
		});
		//act
		x.addAll(object);
		int y = x.totalCount();		
		assertEquals(0, y);
	}
////////////////////////////////////////////////////////////////////
	@Test
	public void removeTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		String entry = "Nada";
		x.remove(entry);
		int y = x.totalCount();
		assertEquals(2, y);
	}
	@Test
	public void removeTest2() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		String entry = "Ayat";
		Object result = x.remove(entry);
		assertEquals(null, result);
	}
	@Test
	public void removeTest3() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		String entry = null;
		Object result = x.remove(entry);
		assertEquals(null, result);

	}
	@Test
	public void removeTest4() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		String entry = "";
		Object result = x.remove(entry);
		assertEquals(null, result);
	}
///////////////////////////////////////////////////////////////////
	@Test
	public void removeAllTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "Nada";
		x.removeAll(entry);
		int y = x.totalCount();
		assertEquals(2, y);
	}
	@Test
	public void removeAllTest2() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "Ayat";
		x.removeAll(entry);
		int y = x.totalCount();
		assertEquals(5, y);
	}
	@Test
	public void removeAllTest3() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = null;
		x.removeAll(entry);
		int y = x.totalCount();
		assertEquals(5, y);
	}
	@Test
	public void removeAllTest4() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "";
		x.removeAll(entry);
		int y = x.totalCount();
		assertEquals(5, y);
	}
//////////////////////////////////////////////////////////////////
	@Test
	public void removeMultiTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "Nada";
		int multi = -1;
		x.remove(entry, multi);
		int y = x.totalCount();
		exception.expect(IllegalArgumentException.class);
		assertEquals(5, y); //FAIL
	}
	@Test
	public void removeMultiTest2() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "Nada";
		int multi = 0;
		x.remove(entry, multi);
		int y = x.totalCount();
		assertEquals(5, y);
	}
	@Test
	public void removeMultiTest3() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "Ayat";
		int multi = 1;
		int result = x.remove(entry, multi);
		assertEquals(0, result);
	}
	@Test
	public void removeMultiTest4() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = null;
		int multi = 5;
		int result = x.remove(entry, multi);
		assertEquals(0, result);
	}
	@Test
	public void removeMultiTest5() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		String entry = "";
		int multi = 5;
		int result = x.remove(entry, multi);
		assertEquals(0, result);
	}
/////////////////////////////////////////////////////////////////////
	@Test
	public void intersectTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Ayat");
		x.add("Sabry");
		multiset.add("Mark");
		multiset.add("Sarah");
		multiset.add("Nada");
		multiset.add("John");
		multiset.add("Hassan");	
		Object result = x.intersect(multiset);
		multiset2.add("Nada");
		multiset2.add("Sarah");
		multiset2.add("Mark");
		assertEquals(multiset2, result);
	}
	@Test
	public void intersectTest2() 
	{
		//AAA
		x.add(1);
		x.add("Sarah");
		x.add(4);
		x.add("Ayat");
		x.add(8);
		multiset.add("Mark");
		multiset.add("Sarah");
		multiset.add("Nada");
		multiset.add("John");
		multiset.add("Hassan");	
		Object result = x.intersect(multiset);
		multiset2.add("Sarah");
		assertEquals(multiset2, result);
	}
	@Test
	public void intersectTest3() 
	{
		//AAA
		x.add(1);
		x.add("");
		x.add(4);
		x.add("Ayat");
		x.add(8);
		multiset.add("");
		multiset.add("Sarah");
		multiset.add("");
		multiset.add("John");
		multiset.add("Hassan");	
		Object result = x.intersect(multiset);
		multiset2.add("");
		assertEquals(multiset2, result);
	}
/////////////////////////////////////////////////////////////////////
	@Test
	public void totalCountTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Nada");
		x.add("Nada");
		int result = x.totalCount();
		assertEquals(5, result);
	}
	@Test
	public void totalCountTest2() 
	{
		//AAA
		x.add(1);
		x.add("Sarah");
		x.add("Nada");
		x.add(Integer.MAX_VALUE);
		x.add("Nada");
		int result = x.totalCount();
		assertEquals(5, result);
	}
	@Test
	public void totalCountTest3() 
	{
		//AAA
		int result = x.totalCount();
		assertEquals(0, result);
	}
	@Test
	public void totalCountTest4() 
	{
		//AAA
		x.add("");
		int result = x.totalCount();
		assertEquals(1, result);
	}
	@Test
	public void totalCountTest5() 
	{
		//AAA
		x.add(null);
		int result = x.totalCount();
		assertEquals(1, result);
	}
/////////////////////////////////////////////////////////////////////
	@Test
	public void toListTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Ayat");
		x.add("Sabry");
		List y = x.toList();
		List<String> strings = Arrays.asList("Sarah", "Nada", "Ayat", "Sabry", "Mark");
		assertEquals(strings, y);
	}
	@Test
	public void toListTest2() 
	{
		//AAA
		List y = x.toList();
		List<String> strings = Arrays.asList();
		assertEquals(strings, y);
	}
////////////////////////////////////////////////////////////////////
	@Test
	public void toStringTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Ayat");
		x.add("Sabry");
		String y = x.toString();
		String expected = "{Sarah, Nada, Ayat, Sabry, Mark}";
		assertEquals(expected, y);
	}
	@Test
	public void toStringTest2() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add(1.2);
		x.add("Ayat");
		x.add(1);
		String y = x.toString();
		String expected = "{1.2, 1, Sarah, Ayat, Mark}";
		assertEquals(expected, y);
	}
	@Test
	public void toStringTest3() 
	{
		//AAA
		String y = x.toString();
		String expected = "{}";
		assertEquals(expected, y);
	}
///////////////////////////////////////////////////////////////////
	@Test
	public void equalsTest1() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add("Ayat");
		x.add("Sabry");
		multiset.add("Mark");
		multiset.add("Sarah");
		multiset.add("Nada");
		multiset.add("John");
		multiset.add("Hassan");	
		Boolean result = x.equals(multiset);
		assertEquals(false, result);
	}
	@Test
	public void equalsTest2() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		x.add(null);
		multiset.add("Nada");
		multiset.add("Mark");
		multiset.add("Sarah");
		Boolean result = x.equals(multiset);
		assertEquals(false, result);
	}
	@Test
	public void equalsTest3() 
	{
		//AAA
		x.add("Mark");
		x.add("Sarah");
		x.add("Nada");
		Boolean result = x.equals(multiset);
		assertEquals(false, result);
	}
////////////////////////////////////////////////////////////////////
	/*@Test
	public void hashCodeTest() 
	{
		//AAA
		Object y = x.hashCode();
		exception.expect(IllegalStateException.class);
	}*/
}