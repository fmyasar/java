package assignments3;

public class Question7 {

	public static void main(String[] args) {

		int price=55;
		int paid=100;
		int change=paid-price;
		
		int quarter,dimes,nickle;
			
			quarter=change/25;
			dimes=change%25/10;	
			nickle=change%25%10/5;
	
			
			System.out.println("Price in cents : "+price);
			System.out.println("Your change is "+quarter+" quarters, "+dimes+" dimes, and "+nickle+" nickles");
	}

}

