/*Problem Name :: Sort Array By Swapping

Problem Statement  :: Take A List Of NUmbers ( numList) And Integer (x) as input which Should be present in numlist , Now if
we can sort the list by swapping x with any element of the numList Then print "swapped " And The Sorted List seperated by
Space Else Print "Not Swapped"


NOTE :: 1. Array Should Not Contain Similar Elements
		2. Swapping of X is Allowed Only Once
				*/

/*Solution */



package array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSortSwapping {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
            int N=sc.nextInt();
            int[] numList= new int[N];
            for(int i=0;i<N;i++){
                numList[i]=sc.nextInt();

            }
            int[] numList1= new int[N];
            for (int i=0;i<N;i++){
                numList1[i]=numList[i];
            }
            Arrays.sort(numList1);
            int X=sc.nextInt();
            int position=0;
            for(int i=0;i<N;i++){
                if(numList[i]==X){
                    position=i;
                    break;
                }
            }
            boolean check=false,check1=false;
            for (int i=0;i<N;i++){
                int temp= numList[i];
                numList[i]=X;
                numList[position]=temp;

                check1= Arrays.equals(numList,numList1);
                numList[i]=temp;

                if(check1){
                    check=true;
                    break;
                }
            }

            if(check) {
                System.out.print("Swapped ");
                for (int ele : numList1) {
                    System.out.print(ele + " ");
                }
            }

            else
                System.out.println("NOT Swapped");
        }
    }
