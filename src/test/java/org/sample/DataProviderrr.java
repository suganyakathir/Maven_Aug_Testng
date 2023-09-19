package org.sample;

import org.testng.annotations.DataProvider;

public class DataProviderrr {
	@DataProvider(name="login",indices={0,2},parallel=true)
	private Object [][] datas() {
		Object [][] obj=new Object[][] {
			{"Dinesh","888"},
			 {"Green","1111"},
			 {"Raj","3333"}
	};
	return obj;
}
}