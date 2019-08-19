public class Ex1_3 {
    public static void main(String[] args){

        //declare int variable
        int sum = 0, i = 1;

        do{
            System.out.println(sum + " + " + i + " = " + (sum += i));// add from 1 to 10
            i++;
        }
        while(i <= 10);
    }
}
