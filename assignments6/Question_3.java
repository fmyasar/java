package assignments6;

public class Question_3 {

	public static void main(String[] args) {

/* Write a Java program to print the following pattern
 
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
	
		*/
		for(int i=1; i<=7; i++) {
			for(int b=1; b<=i; b++) {
				System.out.print(" ");
			}
			
			for(int j=i; j<=7; j++) {
				System.out.print(j+" ");
			}System.out.println("");
		}
		
		for(int i=1; i<=13-i; i++) {
			for(int b=7; b>i; b--) {
				System.out.print(" ");
			}
			
			for(int j=7-i; j<=7; j++) {
				System.out.print(j+" ");
					
			}
			System.out.println("");	
		}
		
		
	}

}
