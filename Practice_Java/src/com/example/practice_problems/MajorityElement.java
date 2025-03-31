package com.example.practice_problems;

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int []arr){
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }

        }
        for(int value : map.keySet()){
            if(map.get(value)>n/2){
                System.out.println(value);
                return value;
            }
        }
        System.out.println("No value exist which occured more than n/2 times.");
        return -1;


    }

    public static void main(String[] args){
        int []v= {1,1,4,7,1,4};
        System.out.println("The Value will be: ");
        majorityElement(v);


    }
}


