package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        for (int i = 10; i > 0; i--) {
            m= (n * i);
            System.out.printf("%-3dx%-5d=%-1d\n",n,i,m);

        }
    }}
