import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int totalScore =0;
int count =1;
while (count <=10){
System.out.println("Enter a score: ");
int score = input.nextInt();
if (score >0 && score <100){
count++;
}
totalScore = totalScore + score;
}
System.out.println("Total Score: "+ totalScore);
}
}
