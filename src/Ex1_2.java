public class Ex1_2 {
    public static void main(String[] args){
        //declare int variables
        int multiples, i = 1;
        boolean done = false;

        //run loop while multiplies are between 10 and 95
        while(!done){
            multiples = 5 * i;
            if(multiples <= 95){
                if(multiples >= 10 && multiples <= 95){
                    System.out.println("5 X "+ i + " = " + multiples);
                }
            }
            else{
                done = true; //loop finishes when it is over 95
            }
            i++;
        }
    }
}
