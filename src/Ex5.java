import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
        //declare input value
        int input;

        //prompt user input
        System.out.print("Enter any number:");
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextInt();

        //determine even or odd number
        if(input % 2 == 0){
            System.out.println(input + " is even number.");
        }
        else {
            System.out.println(input + " is odd number.");
        }

    }
}
