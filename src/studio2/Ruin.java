
package studio2;




import java.util.Scanner;




public class Ruin {




public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("What is your Starting Amount");

double startAmount = in.nextDouble();

System.out.println("What is your Win Chance");

double winChance = in.nextDouble();

System.out.println("What is your Win Limit");

double winLimit = in.nextDouble();

System.out.println("How Many Days");

int totalSimulations = in.nextInt();


int dayNumber = 0;

int amountWins = 0;

int amountLoss = 0;


for (int i = 0; i < totalSimulations; i++) {

double currentScore = startAmount;


boolean isGoing = true; 


while (isGoing == true){

if (Math.random() < winChance) {

currentScore += 1;

}

else {

currentScore -= 1;

}


if (currentScore == 0){

System.out.println(currentScore+": LOSE");

isGoing = false;

amountLoss ++;

}

else if (currentScore >= winLimit){

System.out.println(currentScore+": Win");

amountWins ++;

isGoing = false;

}





}

dayNumber ++;

System.out.println("Day "+ dayNumber);





}

System.out.println("Total Wins: "+amountWins + " Total Loss: "+ amountLoss);


}

}








