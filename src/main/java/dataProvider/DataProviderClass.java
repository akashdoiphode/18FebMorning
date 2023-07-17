package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="policyBazarData")
	public static String[][] testData(){
		//String data[][]= {{"9850005857","Policy@6","Akash Doiphode"}};
		String data[][]= {{"Akash Doiphode"}};
		return data;
	}

}
