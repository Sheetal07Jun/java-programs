import java.util.Scanner;

public class condition2
{

	public static void main(String[] args) {
		int button;
		System.out.println("enter any number");
		Scanner obj=new Scanner(System.in);
		button=obj.nextInt();
		if(button==1)
		{
			System.out.println("Hello World");
		}
		else if(button==2)
		{
			System.out.println("Namaste World");
		}
		else if(button==3)
		{
			System.out.println("Bonjour World");
		}
		else
		{
			System.out.println("Invalid button");
		}

	}

}
