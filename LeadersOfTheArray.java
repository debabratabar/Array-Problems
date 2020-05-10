/*Problem Name :: Leaders of The Array
Problrm Statement ::  An element is leader if it is greater than all the elements to its right side. 
And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2. 
*/

/*Solution */

package array;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersOfTheArray {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int T= sc.nextInt();// here T variable takes the Number Of Test Cases
        for(int counter=0;counter<T;counter++){
            int N=sc.nextInt();// N Variable Takes the Array size
            int[] arr = new int[N];
            for (int i=0;i<N;i++){// here Array elements are Entered
                arr[i]=sc.nextInt();
            }

           List<Integer> li= new ArrayList<>();//here we take a Arraylist to store Leaders of the Array

            int count;
            for(int i=0;i<N-1;i++){
                int greater=arr[i];// for each element firstly We set this  element as greater
                count=0;
                for(int j=i+1;j<N;j++){
                    if(greater>arr[j]){
                        count++;
                    }


                }
            
                if(count==N-i-1){// Here we check that the element is really a leader of the array or not

                    li.add(greater);

                }
            }
            li.add(arr[N-1]);// As we all know Array last element will always
            //be A Leader cause it has No element to its right

            System.out.println(li);
        }
    }
}

