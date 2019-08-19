import java.util.Scanner;
public class Ex2
{
    public static void main(String[] args)
    {
        int n = 3, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 number elements you want in array:");
        int a[] = new int[n];//assgin array in to int a (4 values can be stored)
        //store numbers from user
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        //compare each number high or low
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                //if the first num is bigger than second, array1 store array2 and move 1 to the second place
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        //print numbers n-1 because array starts from 0
        //print until second array because of comma
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        //print last array num
        System.out.print(a[n - 1]);
    }
}