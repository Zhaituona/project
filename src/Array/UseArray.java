package Array;
import java.util.Scanner;
import java.util.Random;
public class UseArray {
    public static void main(String[] args) {
        int [] array = new int[6];
        Scanner sc = new Scanner(System.in);
        sc.close();  //this is for the scanner input
        Random random = new Random();
        //this is for the random number
        System.out.println("please enter numbers");
        for(int i = 0; i <array.length;i++){//i is the index for the arra
            // array [i]= random.nextInt(100);
            array[i] = sc.nextInt();
            // declare a array must have index size , so we
        }
       for(int j =0; j<array.length;j++) {
           System.out.println("the array index value is" +  " " + array[j] );//can know how many index we can use to store data .
       }
        array[0] = 6;
        array[6]= 8;
        array[4]=9;
        System.out.println(array[5]);//if we didn;t give the data for the array
        //index it will default store 0 .
    }
}
