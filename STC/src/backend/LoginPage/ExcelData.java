package backend.LoginPage;

import org.testng.annotations.Test;

import backend.DataProvider.ExcelDataProvider;

public class ExcelData {

	@Test(dataProvider = "ExceldataForRawMessage", dataProviderClass = ExcelDataProvider.class, priority = 1)
	public void ExcelData(String FirstName,String LastName) throws InterruptedException {

		System.out.println(FirstName);
		System.out.println(LastName);

	}

	@Test(dataProvider = "Exceldata", dataProviderClass = ExcelDataProvider.class, priority = 2)
	public void Data(String Address) throws InterruptedException {
		System.out.println(Address);
	}

}
