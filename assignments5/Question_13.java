package assignments5;

public class Question_13 {

	public static void main(String[] args) {

		/* Print following chessboard using nested for loops.
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W

NOTE:
1. Total 8 rows and 8 columns.
2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B. 
	 */	
	
		String l1="w";
		String l2="B";

	for(int i=1; i<=8; i++) {
		
		for(int j=1; j<=8; j++) {
			
			if((i+j)%2==0) {
				System.out.print(l1+" ");
			}else {
				System.out.print(l2+" ");
				
			}
		}	
		System.out.println();

	}
	}
}
	
	
	/*
	 * if(i%2==0) {
	 
	
		if(j%2==0) {
		System.out.print(l1+" ");

		}else {
			System.out.print(l2+" ");
	
		}
	}else {
		
		if(j%2==0) {
			System.out.print(l2+" ");

			}else {
				System.out.print(l1+" ");
			}
	}
}
	
*/
