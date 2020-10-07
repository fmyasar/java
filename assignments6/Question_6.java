package assignments6;

public class Question_6 {

	public static void main(String[] args) {
		/* 
		1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15
		*/
		int sum;
		
		for(int i=1; i<=5; i++) {
			sum=i;
			for(int j=1; j<=i; j++) {
				System.out.print(sum+" ");
				sum=sum+5-j;
				
			}System.out.println("");
		}
	}

}
