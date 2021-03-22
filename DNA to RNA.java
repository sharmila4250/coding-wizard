import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the DNA");

String j=sc.nextLine();
String d=j.toUpperCase();
String n="";
for(int i=0;i<d.length();i++) {
	char p=d.charAt(i);
	if(p=='G') {
		n=n+'C';
	}
	else if(p=='C') {
		n=n+'G';
	}
	else if(p=='T') {
		n=n+'A';
	}
	else if(p=='A') {
		n=n+'U';
	}
	
}if(d.length()==n.length()) {
System.out.println(n);
	}
else{System.out.println("invalid");
	}
}

}
