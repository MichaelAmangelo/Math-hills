
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int min = 1;
        int max = 500;
        int range = max - min + 1;
        int Max;
        int Min;
        int avg;
        double Avg;
        int val;
        int c;
        double cd;
        do {
            System.out.print("Enter integer n, greater than 0: ");

            n = scan.nextInt();

        } while (n < 1);

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range + min);
        }
        System.out.println("Array on one line:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array on one line:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum:" + Max(arr));
        System.out.println("Minimum:" + Min(arr));
        System.out.println("Sum:" + sum(arr));
        System.out.println("Average:" + Avg(arr));
        System.out.println("Number of integers greater average:" + gta(arr));
        System.out.println("Number of times subsequent value increases:" + coa(arr));
        System.out.println("Number of times subsequent value decreases:" + doi(arr));
        System.out.println("Array with 3 elements per line:");
        c(arr);

    }

    public static int Max(int[] arr) {
         int Max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int Min(int[] arr) {
         int Min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }
    public static int sum(int[] arr) {
        int sum =0;
        for(int i =0; i < arr.length-1; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double Avg (int[] arr) {
        double sum = 0.0;
        double Avg = 0.0;
        for(int i =0; i < arr.length; i++){
            sum = sum + arr[i];
            Avg = sum/arr.length;
        }
        return Avg;
    }

    public static int gta(int[] arr) {
        double Avg = Avg(arr);
        int gta =0;
        for(int i =0; i < arr.length; i++){
            if(arr[i]>Avg){
                gta = i;
            }
        }
        return gta;
    }

    public static int coa(int[] arr)
    {
        int coa =0;
        for(int i =0; i < arr.length-1; i++){

            if(arr[i+1]>arr[i]){     // if the next number is bigger than the current number.
                    coa=i;
            }
        }
        return coa;
    }

    public static int doi(int[] arr)
    {
        int doi=0;

        for(int i =0; i < arr.length-1; i++) {

            if (arr[i + 1] < arr[i]) {     // if the next number is smaller than the current number.
                doi = i;
            }
        }
        return doi;
    }

    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void c(int[] arr)
    {
        int c =0;
        for(int i =0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
            c += 1;                        //
            if(c==3) // conditon for element print.
            {
                System.out.println();
                c =0;
            }
        }
    }

}








