package com.nibedita.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private  static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void quitDriver() {

        if (driver.get() != null) {

            driver.get().quit();

            driver.remove();
        }
    }
}

