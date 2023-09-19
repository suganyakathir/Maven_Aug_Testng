package org.sample;

import org.base.BaseClass;

import org.testng.annotations.Test;

public class FireFoxB extends BaseClass {
	@Test
	private void Test2() {
		browserLaunch2("firefox");
		urlLaunch("http://www.greenstechnologys.com/");
		implicitlyWait(20);
}
}