package array;

import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int element= sc.nextInt();
        int[] array =new int[N];
        for (int i=0;i<N;i++){
            array[i]=sc.nextInt();

        }
        int occurance=0;
        Arrays.sort(array);
        for (int i=0;i<N;i++){

            if (array[i]>element){
                break;
            }
            if(array[i]==element){
                occurance++;
            }
        }
        System.out.println(occurance);
    }
}
