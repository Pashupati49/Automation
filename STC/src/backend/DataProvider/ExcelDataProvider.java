package backend.DataProvider;

import org.apache.commons.collections4.Get;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelData_Creator;

public class ExcelDataProvider {

	@DataProvider(name = "RawMessageExcelImport")
	public static Object[][] ExcelRawMessage() throws Exception {
		String xlFilePath = "./Excels/ExcelDataRawMessage.xlsx";
		String sheetName = "RawMessage";
		ExcelData_Creator xlData = new ExcelData_Creator(xlFilePath);
		Object[][] data = xlData.getTestData(xlFilePath, sheetName);
		return data;

	}
}
