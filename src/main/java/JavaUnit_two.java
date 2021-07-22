import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JavaUnit_two 
{ 
	@BeforeClass
	public static void beforeclas() 
	{
		System.out.println("before class");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class");
	}
	@Test
	public void after() 
	{
		System.out.println("after");
		Date date = new Date();
		System.out.println(date);
	}
	@Before
	public void before() 
	{
		System.out.println("before");
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void testmethod() 
	{
     System.out.println("test method 1");
     System.out.println("test 2");
	}
	@Test
	public void Branch2Method() 
	{
     System.out.println("test method 2");
	}

}