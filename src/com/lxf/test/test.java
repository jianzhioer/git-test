package com.lxf.test;

import java.util.Arrays;
import java.util.HashSet;

public class test {
    private static void f(Letter y){
        y.c = 'z';
    }
    public static void main(String[] asgs){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
        int a=0;
        System.out.println(a++);
        System.out.println(a);
        a = 0;
        System.out.println(++a);
        int[] pri = {1,2,3,4,5,6,7};
        rotate(pri,3);
        System.out.println(Arrays.toString(pri));
    }
    private static void rotate(int[] nums, int k) {
        int num = k%nums.length;
        int[] num1 = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            num1[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0; i < nums.length ; i++){
            nums[i] = num1[i];
        }
        System.out.println(Arrays.toString(num1));
        nums = num1;
        System.out.println(Arrays.toString(nums));
    }
    public int singleNumber(int[] nums) {
         HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i: nums) {
            if (hashSet.contains(i))
                hashSet.remove(i);
            else {
                hashSet.add(i);
            }
        }
        return hashSet.iterator().next();
    }
}
class Letter{
    char c;
}
