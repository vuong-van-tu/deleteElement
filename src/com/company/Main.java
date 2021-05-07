package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = 20;
            int array[]= new int[size];
            array[0]=2;
            array[1]=5;
            array[2]=8;
            array[3]=7;
            array[4]=1;
            array[5]=7;
            int n =6;
            System.out.println("Mảng trước khi xóa :");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println("\n");
            System.out.println("Nhập a:");
            int a = sc.nextInt();
            for (int i = 0; i < n; i++) {
                while (array[i]==a){
                    deleteElement(array,n,a);
                }
            }
            System.out.println("Mảng sau khi xóa :");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]+" ");
            }
        }
        public static int deleteElement(int array[],int n,int a){
            int pos = seachElement(array,a);
            if (pos==-1){
                System.out.println("Không có phần tử trong mảng!!");
            }else {
                for (int i = pos; i <n ; i++) {
                    array[i]=array[i+1];
                }
            }
            return n-1;
        }
        public static int seachElement(int array[],int x){
            for (int i = 0; i < array.length; i++) {
                if (array[i]==x){
                    return i;
                }
            }
            return -1;
        }

}
