
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count=0,n=0,r=0,count1=0;
		for(long i=2;i<1000000;i++){
			count1=0;
			n=i;
			while(n!=1){
				if(n%2==0){
					n=n/2;
				}
				else{
					n=3*n+1;
				}
				count1++;
			}
			if(count1> count){
				count=count1;
				r=i;
			}
		}
		System.out.println("No."+r);
		System.out.println("Maximum lenght of chain is:"+count);}}



