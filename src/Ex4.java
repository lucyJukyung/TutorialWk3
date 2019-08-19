public class Ex4 {
    public static void main (String[] args){
        //declare squares sum
        int sum = 0;

        // sum of the squares of 1 - 100
        for(int i = 0; i <= 100; i++){
            sum = sum + (i * i);
            System.out.println(sum);
        }
        // perfect squares
        for(int i = 0; i <= 10; i++){
            sum = i * i;
            System.out.println(sum);
        }
    }
}
