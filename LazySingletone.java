package singleton1;
import java.util.Scanner;

public class Singleton {
    private  int num1;
	private  int num2 ;
	private static Singleton instance;
	
	private Singleton() { 
	
	try (Scanner myObj = new Scanner(System.in)) {
		 System.out.println("1. sayı giriniz");
		 num1=myObj.nextInt();
		 System.out.println("2. sayı giriniz");
		 num2=myObj.nextInt();
	}
	
	}
	
	public static Singleton getInstance()
	
	 { 
	    if (instance == null){
	    instance = new Singleton();
	    
	 
	}
	return instance; }
	
	
	public void Toplam()
	{
	   System.out.printf("%d",num1+num2);
	}
	public void carpma()
	{
	   System.out.printf("%d",num1*num2);
	}
	public void çıkarma()
	{
	   System.out.printf("%d",num1-num2);
	}
	public void bölme()
	{
	   System.out.printf("%d",num1/num2);
	}
}
