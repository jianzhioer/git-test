package com.lxf.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName: test1
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-22
 * @Version: 1.0
 */

public class test1 {
    public static void main(String[] asgs){
        int[] as = new int[5];
        System.out.println(Arrays.toString(as));
        char a = '.';
        char b = '.';
        System.out.println(a==b);
        Solution t = new Solution();
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0;i<9;i++){
            if(!isOK1(i,board))
                return false;
            if(!isOK2(board[i]))
                return false;
        }
        for (int i = 0;i<3;i++){
            for(int l = 0;l<3;l++){
                if(!isOK(i*3,l*3,board))
                    return false;
            }
        }
        return true;
    }
    private boolean isOK(int n, int m,char[][] board){
        char[] ar=new char[9];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                ar[(i+1)*(j+1)-1] = board[n+i][m+j];
            }
        }
        return isOK2(ar);
    }
    private boolean isOK1(int n,char[][] board){
        char[] ar=new char[9];
        for(int i = 0;i<9;i++){
            ar[i] = board[i][n];
        }
        return isOK2(ar);
    }
    private boolean isOK2(char[] ch){
        HashSet<Character> hashSet = new HashSet<Character>();
        for(char a:ch){
            if(hashSet.contains(a)){
                return false;
            }
            if(a!='.')
                hashSet.add(a);
        }
        return true;
    }
}
