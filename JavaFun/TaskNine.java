import java.util.Scanner;
public class TaskNine{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int totalScore =0;
for (int number=1; number<=10; number++){
System.out.println("Enter a score: ");
int score = input.nextInt();

if (score >=0 && score <=100){

totalScore = totalScore + score;
}
}
System.out.println("Total Score: "+ totalScore);
}
}
