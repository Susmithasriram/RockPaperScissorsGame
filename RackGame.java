package task4;
import java.util.Random;
import java.util.*;


public class RackGame {

	public static void main(String[] args) {
		int e=0;
		// TODO Auto-generated method stub
		while(e==0){
		int rock, paper, scissors;

		rock =0; paper=1; scissors = 2;

		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("Enter your choice from  0 = Rock, 1 = paper, 2= scissors");
		
		System.out.println("------------------------------------------------------");
        int sc = scan.nextInt();
     
		
//		 System.out.println("user choice");
		if(sc==0){
			System.out.println("User choice ROCK");

		}
		if(sc==1){
			System.out.println("User choice PAPER");

		}
		if(sc ==2){
			System.out.println("User choice SCISSORS");

		}

		Random rand = new Random();
		int int_rand = rand.nextInt(3);

		if(int_rand==0){
			System.out.println("Computer choice ROCK");

		}
		if(int_rand==1){
			System.out.println("Computer choice PAPER");

		}
		if(int_rand==2){
			System.out.println("Computer choice SCISSORS");

		}

		if(sc ==int_rand){
			System.out.println("------------------------------------------------------");

			System.out.println("it is a tie");
			System.out.println("------------------------------------------------------");

		} 
		else if  (sc == rock){
			if(int_rand== paper){
				System.out.println("------------------------------------------------------");

				System.out.println("You win");
				System.out.println("------------------------------------------------------");

			}else {
				System.out.println("------------------------------------------------------");

				System.out.println("Computer win");
				System.out.println("------------------------------------------------------");

			}
		}

		else if (sc==rock)
		{
			System.out.println("------------------------------------------------------");

			System.out.println("you Wins");
			System.out.println("------------------------------------------------------");

		}
		else
		{
			System.out.println("------------------------------------------------------");

			System.out.println("Computer Wins");
			System.out.println("------------------------------------------------------");


		}
		System.out.println("If you want to exit enter 1 else 0");
		e=scan.nextInt();

	}
	}
}
