package com.example2.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
  
	@Parameters("browser")
	@Test
  public void run_in_multiple_browsers(@Optional() String browser) {
		System.out.println(browser);
  }
	
}
