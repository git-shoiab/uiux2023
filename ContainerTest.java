package edu.disease.asn5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContainerTest {

	@Test(expected=IllegalArgumentException.class)
	public void testConstructor() {
		Container container=new Container();		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGet1() {
		Container container=new Container("hello1",234,"hello3");
		container.get(3);
	}
	
	@Test
	public void testSize() {
		Container container=new Container("hello1",243,"hello3");
		int size=container.size();
		assertEquals(3, size);
	}
	
	@Test
	public void testGet2() {
		Container container=new Container("hello1",243,"hello3");
		String value=container.get(2);
		assertEquals("hello3",value);
	}
	
	@Test
	public void testGet3() {
		Container container=new Container("hello1",243,"hello3");
		int value=container.get(1);
		assertEquals(243,value);
	}
}
