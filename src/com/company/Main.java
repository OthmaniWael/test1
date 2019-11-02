package com.company;

public class Main {

    public static void main (String[] args) {
        int num = 5;//wael Test
        int wael = 5;//wael
        // hetha test lil git
        //a7la wael
        //wael
        int a = 1;
        boolean[][] bo = new boolean[num * num][num * num];
        for (int i = 0; i < num * num; i++) {
            for (int j = 0; j < num * num; j++) {
                bo[i][j] = false;
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1) {
                    for (int k = 0; k < num; k++) {
                        bo[num*i+k][num*j]=true;
                        bo[num*i+k][num*j+num-1]=true;
                        bo[num*i][num*j+k]=true;
                        bo[num*i+num-1][num*j+k]=true;
                    }
                    for (int k = 1; k < num-1; k++) {
                        for (int l = 1; l < num-1; l++) {
                            if(k==l || k+l==num-1){
                                bo[num*i+k][num*j+l]=true;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < num * num; i++) {
            for (int j = 0; j < num * num; j++) {
                System.out.print(bo[i][j]?"X":" ");
            }
            System.out.println();
        }
    }

    public void switchNumWithoutTemp(){
        int a = 12, b = 10;
        a = a+b;//22
        b = a-b;//12
        a = a-b;//10
        System.out.println(a);//10
        System.out.println(b);//12

    }

    public void palindrome(String s){
        String reverse="";
        boolean b = true;
        for (int i=s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
            }
        System.out.println(reverse);
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) != reverse.charAt(i)) {
                b = false;
                break;
            }
        }
        if (b){
            System.out.println("palindrome");

        }else
            System.out.println("no palindrom");
    }

    public void deleteChar(String s,char r){
        String n = "" ;
        for (int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=r){
                n += s.charAt(i);
            }
        }
        System.out.println(n);
    }


}
