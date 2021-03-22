import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
char c =0;
int ucount=0;int ccount=0;int draw=0;String res = null;

for(int i=0;i<3;i++) {
	System.out.println("enter R for rock ,P for paper,S for scissor");
	char t=sc.next().charAt(0);
	int n=(int) (Math.random()*((2-0+1)+0));
	if(n==0) {
		 c='R';
	}if(n==1) {
		c='P';
	}if(n==2) {
		 c='S';
	}
	System.out.println("computers turn"+c);
	
if(t=='R' && c=='P'||t=='S' && c=='R'||t=='R' && c=='P') {
	ccount++;
	System.out.println("computer won the round");
	}
	else if(t=='P' && c=='R'||t=='R' && c=='S'||t=='S' && c=='P'){
			
ucount++;System.out.println("users won the round");
}
	else if(t=='R' && c=='R'||t=='S' && c=='S'||t=='P' && c=='P') {
		draw++;System.out.println("draw");
	}

}String g="computer wins";
String x="user wins";
String f="draw";
if(ccount>ucount) {
res=g;
}
else if(ccount<ucount) {
res=x;}
else if(ccount==ucount) {
res=f;}
System.out.println("3 rounds over "+"user scored "+ucount+" "+res);
}}
