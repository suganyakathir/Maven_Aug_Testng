package org.sample;

import org.base.BaseClass;

import org.testng.annotations.Test;

public class EdgeA extends BaseClass{
@Test
private void test1() {
	browserLaunch2("edge");
	urlLaunch("http://www.greenstechnologys.com/");
	implicitlyWait(20);

}
}
