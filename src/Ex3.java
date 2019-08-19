import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        int input;
        char c;

        //prompt user input
        System.out.println("Enter number between 0 and 35:");
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextInt();

        //Number can only be between 0 and 35
        if(input >= 0 && input <=35){

            //if number is less than or equal to 9
            if(input >= 0 && input <=9){
                System.out.println(input);
            }
            //print alphabet from num 10
            else{
                c = (char)(input + 55); //alphabet starts from 65 in ASCII table, + 55 will match from decimal 10.
                System.out.println(c);
            }
        }
        else{
            System.out.println("Ensure the number is between 0 and 35");
        }
    }
}
