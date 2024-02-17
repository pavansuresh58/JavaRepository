package ControlFlowStatement;

public class StringDemo {

	public static void main(String[] args) 
	{
		/*
		String s1="Hello"; //literal
		String s2=new String ("Hello");
		
		 System.out.println(s1==s2  ); //false
		
		String s3="Hello";
		System.out.println(s1==s3);
		
		//String is immutable
		
		s1=s1+"All";
		System.out.println(s1==s3); //false
		/*
		//length
		String ss1="Hello Everyone!";
		System.out.println("length of the string is: "+ss1.length());
		
		// to get charactoer from string -charAt(index)
		System.out.println(ss1.charAt(8));
		
		
		/* Equlaity b/w string 
		 * exact matching = equals()
		 * Equals Ignorecase()
		 */
		
		String act="Selenium WebDriver is WebUI API";
		String exp="Selenium WebDriver is WebUI API";
		System.out.println(act.equals(exp));
		System.out.println(exp.equalsIgnoreCase(exp));
		
		//toUppercase() toLowerCase()
		String ss1="Hello Everyone!";
		System.out.println(ss1.toLowerCase());
		System.out.println(ss1.toUpperCase()); 
		
		//partial string match - contains()
		System.out.println(act.contains("API")); // true
		System.out.println(act.contains("api")); //false
		
		System.out.println(act.contains("library")); //false 
		
		
		//trim - ignore white space before and after the string
		String ss2 ="    Welcome   all      ";
		System.out.println(ss2.trim()) ;
		
		//starts with (Prefix) and endswith(suffix)
		String msg ="Appium is mobile application testing tool";
		System.out.println(msg.startsWith("Appium"));
		System.out.println(msg.startsWith("A"));
		System.out.println(msg.startsWith("Selenium")); 
		
		System.out.println(msg.endsWith("tool"));
		System.out.println(msg.endsWith("l"));
		System.out.println(msg.endsWith("oo"));
		
		
		//split(regular Expression) RE-pattern matching
		String tools="Selenium,Appium,Postman,API,JMeter";
		System.out.println(tools);
		
		String arr[]=tools.split(",");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
 