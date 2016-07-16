package com.stock.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.stock.master.stockaccounting_lib;

public class stockacctountingFL {


	public static void main(String[] args) throws IOException
	{
		stockaccounting_lib SL=new stockaccounting_lib();
		SL.openApp("http://qedgetech.com/1");
        SL.Login("admin","master");
		
		
		String uompath="D:\\Sans\\stock\\src\\com\\stock\\testdata\\UOM_id.xlsx";
		FileInputStream fis=new FileInputStream(uompath);
		
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet WS=WB.getSheet("UOM");
		
		int RC=WS.getLastRowNum();
		System.out.println(RC);
		for (int i = 1; i <=RC; i++) 
		{
			XSSFRow WR=WS.getRow(i);
			XSSFCell WC1=WR.getCell(0);
			XSSFCell WC2=WR.getCell(1);
			String UOMId=WC1.getStringCellValue();
			
			String UOMDESC=WC2.getStringCellValue();
			System.out.println(UOMId+"....."+UOMDESC);
			
			
			SL.UOM(UOMId,UOMDESC);
			
		 }
		
		//XSSFRow WR=WS.getRow(3);
	//	XSSFCell WC=WR.getCell(1);
		
		//String uid=WC.getStringCellValue();
		//System.out.println(uid);
		
		
		
		 
	
		

	}

}
