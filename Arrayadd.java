package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is program with a array game which increments the values except the 
//max value and print the count to make the number of moves 
//to make all the number equal

public class Arrayadd {
    public static void main(String[] args) {
        int [] arr={1,3,6,2,7,4};
        boolean flag=true;
        int count=0;
        while(flag){
            int maxIndex=getMaxIndex(arr);
            if (checkSame(arr)){
                flag=false;
            }
            else{
                count++;
                for (int i=0;i<arr.length;i++){
                    if (maxIndex==i){
                        continue;
                    }
                    else{
                        arr[i]=arr[i]+1;
                    }
                }
            }


        }
        System.out.println(count);
    }
    public static boolean checkSame(int[] a){
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            if (a[i]==temp){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static int getMaxIndex(int [] a){
        int num=0,max=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
                num=i;
            }
        }
        return num;
    }

}
