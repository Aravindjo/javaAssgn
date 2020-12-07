package fullstock.java.javapgm;

import java.util.Scanner;

public class cibil 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your cibil score");
	int cibil=scan.nextInt();
	if(cibil<500||cibil>1000)
	{
	System.out.println("you are not eligible for any loans");
	}
	else 
	{
		if (cibil>=500&&cibil<700)
		{
		System.out.println("you will get personal loan of 2Lakhs");
		}
	else if(cibil>=700&&cibil<800)	
	 {
		System.out.println("you will get business loan of 6lakhs"); 
	 }
	else if(cibil>=800&&cibil<1000)
	 {
		 System.out.println("you will get home loan of 8lakhs");
	 }
	}
	 
}

}
