package org.gecko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\GeckoSel\\driver\\geckodriver.exe");
	
	//launch browser
	WebDriver c=new FirefoxDriver();
	c.get("http://www.greenstechnologys.com/");
	String a = c.getCurrentUrl();
	System.out.println(a);
	String b = c.getTitle();
	System.out.println(b);
	
	WebDriver d=new FirefoxDriver();
	d.get("https://www.facebook.com/");
	String a1 = d.getCurrentUrl();
	System.out.println(a1);
	String b1 = d.getTitle();
	System.out.println(b1);
	
	WebDriver e=new FirefoxDriver();
	e.get("https://www.amazon.in/");
	String a2 = e.getCurrentUrl();
	System.out.println(a2);
	String b2 = e.getTitle();
	System.out.println(b2);
	
	WebDriver f=new FirefoxDriver();
	f.get("http://www.greenstechnologys.com/selenium-course-content.html");
	String a3 = f.getCurrentUrl();
	System.out.println(a3);
	String b3 = f.getTitle();
	System.out.println(b3);
}
}
