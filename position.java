import java.util.Scanner;

public class additinalprogr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);int count=0;
		System.out.println("enter the direction where man moves first");
		String d=sc.nextLine();
		System.out.println("enter the direction where man moves second");
		String e=sc.nextLine();
		System.out.println("enter the direction where man moves third");
		String f=sc.nextLine();
		System.out.println("enter the direction where man moves fourth");
		String g=sc.nextLine();
		if(d.equals(e)&&d.equals(f)&&d.equals(g)){
			System.out.println("user position is 0");
		}
		else if(d.equals(e)||d.equals(f)||d.equals(g)) {
			System.out.println("user position is 4");
		}
		
		 
		else {
			System.out.println("travelling wasted");
		}
	}

}
