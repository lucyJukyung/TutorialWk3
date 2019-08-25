import java.util.*;

public class Ex1 {
    public static void main(String[] args){
        //decalre user input variable
        int input;
        String greeting1 = "Good day", greeting2 = "Good evening";

        //prompt user input
        System.out.print("Enter number between 1 and 24: ");
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextInt();

        //compare user input
        if(input >= 1 && input < 18){
            System.out.println(greeting1);
        }
        else if(input >= 18 && input < 24){
            System.out.println(greeting2);
        }
        else {
            System.out.println("Number available only between 1 and 24");
        }
    }
}
