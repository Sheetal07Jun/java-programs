import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		int marks;
		System.out.print("please enter marks");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>=60 && marks<=100)
		{
			System.out.println("you are brillent student");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("you are excellent student");
		}
		else if(marks>=35 && marks<50)
		{
			System.out.println("you are good student");
		}
		else
		{
			System.out.println("you are poor student");
		}
	}	
}	 
