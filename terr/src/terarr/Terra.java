package terarr;

import java.util.Scanner;

public class Terra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		  int x = 1;
		  int y = 4;
		  int soma;
		  while(x <= 10) {
			  soma = y * x;
			  System.out.println(y +"x"+ x +" = " + soma );
			  x = x + 1;
			  
		  }
           
	}

}
