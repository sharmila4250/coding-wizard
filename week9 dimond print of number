import java.util.Scanner; 
  
public class question4 { 
    void display(int n) 
    { 
        int space = n / 2, num = 1; 
          for (int i = 1; i <= n; i++) { 
  
            for (int j = 1; j <= space; j++) 
                System.out.print(" "); 
  
            int count = num / 2 + 1; 
            for (int k = 1; k <= num; k++) { 
                System.out.print(count); 
                if (k <= num / 2) 
                    count--; 
                else
                    count++; 
            } 
            System.out.println(); 
            if (i <= n / 2) {
                space = space - 1; 
                num = num + 2; 
            } 
            else { 
                space = space + 1; 
                num = num - 2; 
            } } } 
    public static void main(String[] args) 
    { 
        question4 p = new question4(); 
        int n = 7; 
        p.display(n); 
    } 
} 
