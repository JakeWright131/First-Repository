import java.util.Scanner;

public class Sales{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		double total = 0;
		int productid;

		System.out.print("Enter product number (1 to 5, or 0 to quit): ");
		productid = inputInt();

		while(productid !=0){
			if(productid >= 1 && productid <=5){
				System.out.println("Enter quantity sold: ");
				int quantity = nextInt();
				switch(productid){
					case 1:
						total += quantity * 2.98;
					break;
					case 2:
						total += quantity * 4.50;
					break;
					case 3:
						total += quantity * 9.98;
					break;
					case 4:
						total += quantity * 4.49;
					break;
					case 5:
						total += quantity * 6.87;
					break;
			}
		}else{

			System.out.println("Not a valid product number.");
			}
		System.out.print("Enter product number (1 to 5, or 0 to quit): ");
		productid = inputInt();
				}
		System.out.println("Total value of products sold: "+math.round((total * 10000.0)/10000.0));
		}
	}
}

