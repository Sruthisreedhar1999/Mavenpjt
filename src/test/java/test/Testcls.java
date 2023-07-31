package test;
import org.testng.annotations.Test;

import page.Main;

public class Testcls extends Basecls{
	@Test
	public void test()
	{
		Main m=new Main(driver);
		
		m.pageclick();
	}

}
