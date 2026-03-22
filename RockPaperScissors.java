import java.util.*;
public class RockPaperScissors{
    public static void main(String[] args){
        //int rock=0;
        //int paper=1;
        //int scissors=2;

        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int userInput=sc.nextInt();

        Random rnd=new Random();
        int computerInput=rnd.nextInt(3);

        if(computerInput==userInput){
            System.out.println("Tie");
        }
        else if(computerInput==0 && userInput==1 || computerInput==1 && userInput==2 || computerInput==2 && userInput==0){
            System.out.println("Human wins");
        }
        else{
            System.out.println("Computer wins");
        }
        System.out.println("Human choice is "+userInput);
        if(userInput==0){
            System.out.println("Human choice is Rock");
        }
        else if(userInput==1){
            System.out.println("Human choice is Paper");
        }
        else{
            System.out.println("Human choice is Scissors");
        }
        System.out.println("Computer choice is "+computerInput);
        if(computerInput==0){
            System.out.println("Computer choice is Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice is Paper");
        }
        else{
            System.out.println("Computer choice is Scissors");
        }
    }
}