import java.util.Scanner;
public class TaskSeven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int totalScore =0;
int count =0;
for (int number=1; number<=10; number++){
System.out.println("Enter a score: ");
int score = input.nextInt();

if (score %2 == 0){

totalScore = totalScore + score;
count = count + 1;
}
}
double averageScore = (double)totalScore/count;

System.out.println("Total Score: "+ totalScore);
System.out.println("Average Score: "+ averageScore);  
}
}
