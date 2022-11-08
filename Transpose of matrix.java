import java.util.Scanner;

public class matrix {
     public static void main(String [] args)
     {
    	 int a[][]=new int[2][2];
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("enter the array elements");
    	 for(int i=0;i<=1;i++)   // raws
    	 {
    		 for(int j=0;j<=1;j++)  //columns
    		 {
    			a[i][j]=s.nextInt(); 
    		 }
    	 }
    	 
    	 for(int i=0;i<=1;i++)   // raws
    	 {
    		 for(int j=0;j<=1;j++)  //columns
    		 {
    			System.out.print(a[i][j]+" "); 
    		 }
    		 System.out.print("\n");
    	 }
    	 
    	 
    	 
    	 System.out.println("transpose of the matrix is:");
    	 for(int i=0;i<=1;i++)   // raws
    	 {
    		 for(int j=0;j<=1;j++)  //columns
    		 {
    			System.out.print(a[j][i]+" "); 
    		 }
    		 System.out.print(" \n");
    	 }
     }
}
