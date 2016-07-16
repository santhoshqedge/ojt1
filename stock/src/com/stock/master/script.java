package com.stock.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script {

	
	public static void main(String[] args)
	
	{
		WebDriver DR=new FirefoxDriver();
		DR.get("http://qedgetech.com/1");
		DR.findElement(By.id("btnreset")).click();
		DR.findElement(By.id("username")).sendKeys("admin");
		DR.findElement(By.id("password")).sendKeys("master");
		DR.findElement(By.id("btnsubmit")).click();
		DR.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
		DR.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		DR.findElement(By.id("x_Supplier_Name")).sendKeys("Nokia110");
		DR.findElement(By.id("x_Address")).sendKeys("Ammerpet");

	}
}

