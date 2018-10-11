package Array;
import java.util.Random;
public class RandomArray {
    public static void main(String[] args) {
        int [] a =new int[9];
        Random ran =new Random();
        for(int i =0 ;i<a.length; i++){
            a[i] =ran.nextInt(50);//50 is means what is the range you want to store
        }
        for(int j =0; j<a.length; j++){
            System.out.println("the random array index value is "+  " " + a[j]);
        }
    }
}
