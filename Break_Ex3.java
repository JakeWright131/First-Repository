import java.util.Scanner;

public class Break_Ex3{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int counter = 0;


		System.out.println("See if you can guess the correct number.\nGuess a number from 1 to 10.\nYou have 10 attempts.\nEnter numbers <1 to 10 only>: ");

		while(input.hasNext()){
			counter++;
		if((input.nextInt() == 8) || (counter == 10)){
			System.out.println("Match found, it is 8");
			break;
		}

			if(counter == 10){
				System.out.println("Game Over");
			break;
			}
		}
	}

}
