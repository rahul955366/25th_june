import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println("enter radius:");
		float r=s.nextInt();
   	    float pi = 3.14f;
   	    float area=pi*r*r;
		 System.out.println(area);
		// TODO Auto-generated method stub

	}

}
