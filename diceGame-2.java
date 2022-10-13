import java.util.Scanner;
import java.util.*;

public class diceGame {


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	int number = 0;
	int number2 = 0;
	int sum = 0;
	int sum2 = 0;
	int scoreDif = 0;
	int scoreDif2 = 0;
	System.out.println("Hello please enter player 1s name: ");
	String player1 = keyboard.nextLine();
	System.out.println("Hello please enter player 2s name: ");
	String player2 = keyboard.nextLine();
	System.out.println();
	int num = randomNumber();
	int num2 = randomNumber();
	boolean y = true;
	boolean n = false;
	String keepPlaying = "";

	//System.out.println(num);

	do{
	for(int i = 1; i <= 3; i++){
	System.out.println("Roll number "+ i +" for player 1: ");
	num = randomNumber();
	System.out.println(num);
	System.out.println("Roll number"+ i +"for player 2: ");
	num2 = randomNumber();
	System.out.println(num2);
	number += num;
	number2 += num2;

}
	System.out.println(player1 + " Total Score: " + number);
	System.out.println(player2 + " Total Score: " + number2);
	whoWon(player1, player2, number, number2, scoreDif, scoreDif2);
	// if(number > number2){
	// 	System.out.println(player1 + " won");

	// }else if(number == number2){
	// 	System.out.println("you tied");

	// }else{
	// 	System.out.println(player2 + " won");
	// }

	System.out.println("y to play or n to cancel: ");
	 keepPlaying = keyboard.nextLine();

	}while(keepPlaying.equals("y"));


	//System.out.println("Thank you for playing!!");






}



public static void whoWon(String player1, String player2, int number, int number2, int scoreDif, int scoreDif2){
	if(number > number2){
		System.out.println(player1 + " won");
		//System.out.println(player1 + " won");
		scoreDif = number - number2;
		System.out.println(player1 +" won by " +  scoreDif + " points");

	}else if(number == number2){
		System.out.println("you tied");

	}else{
		System.out.println(player2 + " won");
		scoreDif2 = number2 - number;
		System.out.println(player2 +" won by " +  scoreDif2 + " points");
	}


} 



public static int randomNumber(){

	Random generator = new Random();
	int num = generator.nextInt(6) + 1;
	//System.out.println(num);
	return num;
}





}