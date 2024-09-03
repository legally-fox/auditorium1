package ru.mirea.pryazhentseva;

import java.util.Arrays;
import java.util.Random;

public class Excercise3_4 {
    public static void main(String[] args){

        Random rand = new Random();
        int length = rand.nextInt(10) + 10;
        int[] a = new int[length];
        int[] b = new int[length];

        for (int i = 0; i < length; i++){
            a[i] = rand.nextInt(40) + 10;
            b[i] = rand.nextInt(40) + 10;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        method1(a, b, length); //Задание №3
        System.out.println();
        method2(a, b, length); //Задание №4
    }
    public static void method1(int[] a, int[] b, int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (a[i] == b[j]){
                    System.out.print(" "+b[j]);
                    break;
                }
            }
        }
    }
    public static void method2(int[] a, int[] b, int length){
        for (int i = 0; i < length; i++){
            BinSearch(a, b[i]);
        }
    }
    public static void BinSearch(int[] a, int x){
        int count = 0;
        int s = 0;
        int e = a.length;
        while (s <= e){
            count++;
            int mid = (s + e) / 2;
            if (a[mid] < x){
                s = mid + 1;
            }
            else if (a[mid] == x){
                System.out.print(" "+x);
                return;
            }
            else{
                e = mid - 1;
            }
        }
    }
}