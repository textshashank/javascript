import java.io.*;
import java.util.*;
public class merge {
    public static void main(String[] args) {
        // int Intervals[][]={{9,10},{1,3},{6,8},{2,4}};
        // Arrays.sort(Intervals,(a,b) -> Integer.compare(a[0],b[0]));
        // for(int i=0;i<Intervals.length;i++){
        //     System.out.println(Intervals[i][0]+" "+Intervals[i][1]);
        // }
        // System.out.println();
        // ArrayList<int[]> l=new ArrayList<int[]>();
        // int intr[]=new int[2];
        // int i=0;
        // while(i<Intervals.length){
        //     int ep=Intervals[i][1];
        //     int j=i+1;
        //     while(j<Intervals.length && ep>=Intervals[j][0]){
        //         j++;
        //     }
        //     intr[0]=Intervals[i][0];
        //     intr[1]=Intervals[j-1][1];
        //     //System.out.println(intr[0]+" "+intr[1]);
        //     l.add(intr);
        //     i=j;
        // }
        
                // Your code goes here
                int nums[]={1,3,4,2,2};
                int count=0;
                while(nums[0]!=nums[nums[0]]){
                    // System.out.println(nums[0]+" "+nums[nums[0]]);
                    // System.out.println(nums[3]);
                    count++;
                    int temp=nums[0];
                    nums[0]=nums[nums[0]];
                    nums[temp]=temp;
                    //if(count==2) break;
                }
                System.out.print(nums[0]);
            }
        
    }

