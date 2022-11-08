import java.util.Scanner;

public class expswitch {

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.println("enter any two numbers");
		Scanner A=new Scanner(System.in);
		a=A.nextInt();
		b=A.nextInt();
		System.out.println("enter your choice");
		ch=A.nextInt();
	
		switch(ch)
		{
		case 1:c=a+b;
		        System.out.println("addition"+c);
		        break;
		case 2:c=a-b;
        System.out.println("sbtration"+c);
                break;
		case 3:c=a*b;
                System.out.println("multipltion"+c);
                break;
		case 4:c=a/b;
               System.out.println("divion"+c);
                break;
		case 5:c=a%b;
               System.out.println("reminder"+c);
                break;
		default:
               System.out.println("Invalid choice");
        }

	}

}
