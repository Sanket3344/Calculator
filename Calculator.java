import java.util.Scanner;
class Calculator
{
	static double num1,num2,output;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1: ");
		num1 = sc.nextDouble();
		System.out.print("Enter the num2: ");
		num2 = sc.nextDouble();
		System.out.print("Enter the Operation which you want to perform: ");
		char op = sc.next().charAt(0);
		boolean flag = true;
		if(op == '+')
			addition(num1,num2);
		else if(op == '-')
			subtraction(num1,num2);
		else if(op == '*')
			multiplication(num1,num2);
		else if(op == '/')
			division(num1,num2);
		else if(op == '%')
			modulus(num1,num2);
		else{
			flag = false;
			System.out.print("Wrong operation is entered!!");
		}

		if(flag)
		  	System.out.println("Output: "+num1+" "+op+" "+num2+ " = "+ output);	
	}
	
	// Addition Method
	public static void addition(double num1,double num2)
	{
		output = num1 + num2;
	}
	// Subtraction Method
	public static void subtraction(double num1,double num2)
	{
		output = num1 - num2;
	}
	// Multiplication Method
	public static void multiplication(double num1,double num2)
	{
		output = num1 * num2;
	}
	// Division Method
	public static void division(double num1,double num2)
	{
		output = num1 / num2;
	}
	// Modulus Method
	public static void modulus(double num1,double num2)
	{
		output = num1 % num2;
	}
}