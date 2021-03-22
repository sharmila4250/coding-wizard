import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
String s=int_to_roman(n);
System.out.println(s);
	}

	private static String int_to_roman(int n) {
		// TODO Auto-generated method stub
		String units[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String tenths[]= {"" , "X" ,"XX", "XXX" , "XXXX" ,"L","LX","LXX","LXXX","XC"};
		String hundred[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thousand[]= {"","M","MM","MMM"};
		return thousand[n/1000]+hundred[(n%1000)/100]+tenths[(n%100)/10]+units[n%10];
		}
	}


