package com.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author ABIRAMI
 *
 */
public class ExcelFile_Utility extends WebDriver_Utility {
	/**
	 * This method is used to fetch the particular data form the excel
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String readSigleDataExcel(String sheet, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_FilePath);
		wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	/**
	 * This method is used to give get the size of the Rows
	 * 
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int excelRowSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_FilePath);
		wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
		return s.getPhysicalNumberOfRows();

	}

	/**
	 * This method is used to get the size of the Columns
	 * 
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int excelColSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_FilePath);
		wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();

	}

	/**
	 * This method is used to get the overall data available in the Excel file
	 */

	public static Object[][] readExcel(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_FilePath);
		wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
		Object[][] data = new Object[excelRowSize(sheet)][excelColSize(sheet)];
		for (int i = 0; i < excelRowSize(sheet); i++) {
			for (int j = 0; j < excelColSize(sheet); j++) {
				data[i][j] = s.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
