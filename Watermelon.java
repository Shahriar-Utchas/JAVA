import java.lang.*;
import java.util.Scanner;
public class Watermelon{

	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		 int w = myObj.nextInt();
	    if(w%2==0 && w>2){
                System.out.println("YES");
            }
        else{
                System.out.println("NO");
            }
	}
}
