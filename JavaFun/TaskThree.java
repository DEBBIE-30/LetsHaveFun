import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int totalScore =0;
for (int number=1; number<=10; number++){
System.out.println("Enter a score: ");
int score = input.nextInt();

totalScore = totalScore + score;
}
double averageScore = (double)totalScore/10;
System.out.println("Total Score: "+ totalScore);
System.out.println("Average Score: "+ averageScore);
}
}
