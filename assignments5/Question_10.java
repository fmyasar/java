package assignments5;

public class Question_10 {

	public static void main(String[] args) {

	/*  Print following output using nested for loops:
		1
		22
		333
		4444
		55555
		666666
		7777777
	*/	
		
		for(int i=1; i<=7; i++) {
			
	
			for(int j=1; j<=i; j++) {
				
				System.out.print(i);
				
			}
			System.out.println();
		}
		
		
	}

}